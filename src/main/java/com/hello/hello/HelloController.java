package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }

    @GetMapping("/hello/student")
    public Student sutudent() {
        Student student = new Student("hira", "hira@com", "java");
        return student;
    }
}
