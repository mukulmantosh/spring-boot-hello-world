package com.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/hello-world")
    public String Mukul(){
        return "Mukul";
    }

    @GetMapping("/students")
    public StudentInformation getStudent() {
        return new StudentInformation(1, "John", "Beatles");
    }


}
