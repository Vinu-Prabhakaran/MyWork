package com.vinu.graphql.model;

import java.util.List;

/**
 * @author Vinu Prabhakaran
 * on Oct 02,2023
 */
public record Department(String depId,String depName) {
    public static final List<Department> departmentList= List.of(
            new Department("dep-1","Electronics"),
            new Department("dep-2","Mechanical")
    );
}
