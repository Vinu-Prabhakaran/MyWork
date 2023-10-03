package com.vinu.graphql.controller;

import com.vinu.graphql.model.Department;
import com.vinu.graphql.model.Employee;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.vinu.graphql.model.Department.departmentList;
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

    /**
     * Here we demonstrate the N+1 problem.
     * <p>If we call employees() to access all 3 employee details, there will be one call for employees()
     * and one call each to fetch department details of each employee.
     * <p> Effectively we end up with N+1 network calls to fulfill the graphql query</p>
     * @param employee
     * @return
     */
   /* @SchemaMapping(typeName = "Employee", field = "department") //field to be passed if method name doesnt match field name in schema
    public Mono<Department> getDepartmentForEmployee(Employee employee){
        System.out.println("Getting department details for "+employee);
        return Mono.just(departmentList.stream()
                .filter(d -> d.depId().equals(employee.depId()))
                .findFirst()
                .orElse(null));
    }*/

    /**
     * Here we solve N+1 problem using BatchMapping to create a Map of Employee and Department
     * <p>This being a 1 to 1 relation has a corresponding map. If it was 1 to N from Employee to Department
     * we could have a Map&lt;Customer,List&lt;Department&gt;&gt; </p>
     * @param employees
     * @return
     */
    @BatchMapping(typeName = "Employee", field = "department")
    public Map<Employee,Department> getEmployeeDepartMentMap(List<Employee> employees){
        System.out.println("Getting department details for "+employees);
        return employees.stream()
                .collect(Collectors.toMap(Function.identity(),e -> departmentList.stream().filter(d -> d.depId().equals(e.depId())).findFirst().orElse(null)))
                ;
    }
}
