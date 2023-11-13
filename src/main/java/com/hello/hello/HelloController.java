package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public List<String> hello(){
        List<String> hellowList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int time = i + 1;
            hellowList.add("hello" + time + "times" );
        }
        return  hellowList;
    }

    @GetMapping("/student")
    public Student sutudent() {
        Student student = new Student("hira", "hira@com", "java");
        return student;
    }
}
