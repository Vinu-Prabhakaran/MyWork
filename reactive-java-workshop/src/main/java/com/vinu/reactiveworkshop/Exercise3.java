package com.vinu.reactiveworkshop;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        Mono<List<Integer>> listMono = ReactiveSources.intNumbersFlux().collectList();
        System.out.println("Got Mono?");
        List<Integer> block = listMono.block();
        //OR
        //List<Integer> block =ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println(block);
        System.out.format("Size = %d",block.size());

        // Below code is added so that the main program waits for the elememnts to be emitted from the Flux with the delays in place
        //System.out.println("Press a key to end");
        //System.in.read();
    }

}
