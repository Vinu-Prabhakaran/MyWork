package com.vinu.graphql.model;

import java.util.ArrayList;
import java.util.List;

import static com.vinu.graphql.model.Department.departmentList;

/**
 * @author Vinu Prabhakaran
 * on Oct 02,2023
 */
public record Employee(String id,String name, String depId) {
    public static List<Employee> employeeList = new ArrayList<>();
    static {
        System.out.println("Creating list of employees");
        employeeList.add(new Employee("emp-1","Vinu","dep-1"));
        employeeList.add(new Employee("emp-2","Arun","dep-2"));
        employeeList.add(new Employee("emp-3","Arjun","dep-1"));
        System.out.println(employeeList);
    }

}

