package com.vinu.reactiveworkshop;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        ReactiveSources.intNumbersFluxWithException()
                .subscribe(System.out::println,
                        (e) -> System.out.println("Exception :"+e.getMessage()),
                        () -> System.out.println("Complete"));
        //Another solution
        ReactiveSources.intNumbersFluxWithException()
                .doOnError(e -> System.out.println("Exception :"+e.getMessage()))
                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and continue on errors
        ReactiveSources.intNumbersFluxWithException()
                .onErrorContinue( (e,n) -> System.out.println("Exception :"+e.getMessage()))
                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        ReactiveSources.intNumbersFluxWithException()
                .onErrorResume( e -> Flux.just(-1,-2))
                .doFinally(signalType -> {
                    if (signalType.equals(SignalType.ON_COMPLETE)){
                        System.out.println("Completed Successfully");
                    } else if (signalType.equals(SignalType.ON_ERROR)){
                        System.out.println("Completed with error");
                    }
                })
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
