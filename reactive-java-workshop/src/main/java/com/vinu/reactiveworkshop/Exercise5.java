package com.vinu.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        ReactiveSources.intNumbersFlux().subscribe(
            System.out::println,
            e -> System.out.println(e.getMessage())     ,
            () -> System.out.println("IntFlux complete")
        );

        ReactiveSources.userMono().subscribe(
            System.out::println,
            e -> System.out.println(e.getMessage())     ,
            () -> System.out.println("UserMono complete")
        );
        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.userFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber<T> extends BaseSubscriber<T>{
     public void hookOnSubscribe(Subscription subscription){
         System.out.println("Subscription happened");
         request(1);
    }

    public void hookOnNext(T value) {
        System.out.println("Item received:"+value.toString());
        request(2);
    }

    public void hookOnComplete() {
        System.out.println("Subscription complete");
    }

}