package com.vinu.graphql.controller;

import com.vinu.graphql.model.Employee;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.vinu.graphql.model.Employee.employeeList;

/**
 * @author Vinu Prabhakaran
 * on Oct 02,2023
 */
@Controller
public class GraphqlDemoController {
    @QueryMapping
    public Mono<String> hello(){
        return Mono.just("Hello, ");
    }

    @QueryMapping
    //@SchemaMapping(typeName = "Query",field = "name")
    public Mono<String> helloWithArgument(@Argument String name){
        return Mono.just(String.format("Hello, %s",name));
    }

    @QueryMapping
    public Mono<Employee> employeeById(@Argument String id){
        return Mono.just(employeeList.stream()
                .filter(e -> e.id().equals(id))
                .findFirst()
                .orElseGet(() -> new Employee("","No Such Employee",null)));
    }

    @QueryMapping
    public Flux<Employee> employees(){
        return Flux.fromIterable(employeeList);
    }
}
