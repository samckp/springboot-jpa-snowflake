package com.sam.snowflake.service.api;

import com.sam.snowflake.service.repository.StudentRepository;
import com.sam.snowflake.service.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class StudentApiController implements StudentApi {

    @Autowired
    StudentRepository studentRepository;

    public ResponseEntity<Student> getStudentById(Long studentId) {
        return new ResponseEntity<>(studentRepository.findStudentById(studentId), HttpStatus.OK);
    }

}
