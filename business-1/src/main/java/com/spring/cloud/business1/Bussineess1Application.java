package com.spring.cloud.business1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Bussineess1Application{
    public static void main( String[] args ){
        SpringApplication.run(Bussineess1Application.class,args);
    }
}
