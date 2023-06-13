package com.vinu.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        // Get the value from the Mono into an integer variable
        ReactiveSources.intNumberMono().block();
        ReactiveSources.intNumberMono().blockOptional().ifPresent(e -> System.out.println(e+1));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
