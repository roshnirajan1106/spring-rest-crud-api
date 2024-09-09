package com.restCrudApi.demo.rest;

import com.restCrudApi.demo.enitity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Roshini","Rajan"));
        theStudents.add(new Student("Viji","Rajan"));
        theStudents.add(new Student("Parthi","Rajan"));
        return theStudents;
    }
}
