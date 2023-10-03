package com.vinu.graphql.model;

import java.util.List;

import static com.vinu.graphql.model.Department.departmentList;

/**
 * @author Vinu Prabhakaran
 * on Oct 02,2023
 */
public record Employee(String id,String name,Department department) {

    public static final List<Employee> employeeList = List.of(
            new Employee("emp-1","Vinu",departmentList.get(0)),
            new Employee("emp-2","Arun",departmentList.get(0)),
            new Employee("emp-3","Arjun",departmentList.get(1))
            );

}

