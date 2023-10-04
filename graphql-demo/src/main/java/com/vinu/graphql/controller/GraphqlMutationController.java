package com.vinu.graphql.controller;

import com.vinu.graphql.model.Employee;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

import static com.vinu.graphql.model.Employee.employeeList;

/**
 * @author Vinu Prabhakaran
 * on Oct 03,2023
 */
@Controller
public class GraphqlMutationController {
    @MutationMapping
    public Mono<Employee> addEmployee(@Argument String name, @Argument String depId){
        String newId = generateNewId();
        Employee newEmployee = new Employee(newId,name,depId);
        employeeList.add(newEmployee);
        return Mono.just(newEmployee);
    }

    private String generateNewId() {
        String nextId="emp-"+(Integer.valueOf(employeeList.get(employeeList.size()-1).id().split("-")[1])+1);
        System.out.println("New Id :"+nextId);
        return nextId;
    }
}
