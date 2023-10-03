package com.vinu.graphql.model;

import java.util.List;

import static com.vinu.graphql.model.Department.departmentList;

/**
 * @author Vinu Prabhakaran
 * on Oct 02,2023
 */
public record Employee(String id,String name, String depId) {

    public static final List<Employee> employeeList = List.of(
            new Employee("emp-1","Vinu","dep-1"),
            new Employee("emp-2","Arun","dep-2"),
            new Employee("emp-3","Arjun","dep-1")
            );

}

