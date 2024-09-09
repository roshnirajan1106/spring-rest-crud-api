package com.restCrudApi.demo.rest;

import com.restCrudApi.demo.enitity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Roshini","Rajan"));
        theStudents.add(new Student("Viji","Rajan"));
        theStudents.add(new Student("Parthi","Rajan"));
    }

    @GetMapping("/students{}")
    public List<Student> getStudents(){

        return theStudents;
    }
    //retrieve a single student
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return theStudents.get(studentId);
    }

}
