package com.vinu.graphql.config;

import com.vinu.graphql.model.Employee;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.graphql.client.RSocketGraphQlClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vinu Prabhakaran
 * on Oct 05,2023
 */
@Configuration
public class GraphqlClientConfig {

    @Bean
    HttpGraphQlClient httpGraphQlClient(){
        return HttpGraphQlClient.builder()
                .url("http://localhost:8080/graphql")
                .build();
    }

    @Bean
    RSocketGraphQlClient rSocketGraphQlClient (RSocketGraphQlClient.Builder<?> builder){
        return builder.tcp("localhost",8080)
                .route("graphql")
                .build();
    }

    @Bean
    ApplicationRunner applicationRunner (RSocketGraphQlClient rSocketGraphQlClient, HttpGraphQlClient httpGraphQlClient){

        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                var query= """
                        query{
                          employees{
                            id
                            name
                            department{
                              depId
                              depName
                            }
                          }
                        }
                        """;
                List<Employee> employees = Arrays.stream(httpGraphQlClient.document(query)
                                .retrieve("employees")
                                .toEntity(Employee[].class)
                                .block())
                        .toList();
                System.out.println("HttpClient call result :"+employees);
                /*String rsocketQuery= """
                          employeeById(id:"emp-1"){
                            id
                            name
                            department{
                              depId
                              depName
                            }
                          }
                        """;
                System.out.println("Rsocket call result :");
                rSocketGraphQlClient.document(rsocketQuery)
                        .retrieve("employeeById")
                        .toEntity(Employee.class)
                        .block(Duration.ofSeconds(5));
                        *//*.subscribe(System.out::println,
                        (e) -> System.out.println("Exception :"+e.getMessage()),
                        () -> System.out.println("Complete"));*/

            }
        };
    }
}
