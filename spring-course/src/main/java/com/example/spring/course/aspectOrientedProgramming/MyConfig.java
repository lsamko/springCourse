package com.example.spring.course.aspectOrientedProgramming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.spring.course.aspectOrientedProgramming")
@EnableAspectJAutoProxy
public class MyConfig {

}
