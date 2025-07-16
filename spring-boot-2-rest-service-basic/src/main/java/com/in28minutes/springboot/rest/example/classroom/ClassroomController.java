package com.in28minutes.springboot.rest.example.classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class ClassroomController {

    @GetMapping("/classrooms")
    public List<Classroom> getClassrooms() {
        return Arrays.asList(
            new Classroom(1L, "101호", "수학"),
            new Classroom(2L, "102호", "영어"),
            new Classroom(3L, "103호", "과학")
        );
    }
}