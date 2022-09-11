package com.sam.snowflake.service.controller;

import com.sam.snowflake.service.entity.Student;
import com.sam.snowflake.service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudents(){

        return new ResponseEntity<>((List<Student>) studentRepository.findAll(), HttpStatus.OK);
    }

}
