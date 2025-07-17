package com.in28minutes.springboot.rest.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.in28minutes.springboot.rest.example.student.Student;

public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요, Gwangjin!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "안녕히 계세요, Gwangjin!";
    }

    @GetMapping("/breakTime")
    public String breakTime() {
        return "잠깐 쉬었다 해요, Gwangjin!";
    }

    @PostMapping("/email")
    public String getEmail(@RequestBody Student user) {
        if(user.getId() == null){
            System.out.println("user가 null입니다.");
        }else {
            System.out.println(user.getName());
            System.out.println(user.getPassportNumber()); 
        }
        return user.getName().toLowerCase(); // user가 null일 가능성 있음!
    }
}
