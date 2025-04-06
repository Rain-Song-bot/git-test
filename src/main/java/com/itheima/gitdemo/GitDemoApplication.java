package com.itheima.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello github");
        System.out.println("third");
        System.out.println("four");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
