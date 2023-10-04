package com.vinu.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

/**
 * @author Vinu Prabhakaran
 * on Oct 03,2023
 */
@GraphQlTest
public class GraphqlDemoControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldGetEmployee() {
        this.graphQlTester
                .documentName("employeeDetails")
                .variable("id", "emp-1")
                .execute()
                .path("employeeById")
                .matchesJson("""
						 {
						      "id": "emp-1",
						      "name": "Vinu",
						      "department": {
						        "depId": "dep-1",
						        "depName": "Electronics"
						      }
						    }
						""");
    }
}
