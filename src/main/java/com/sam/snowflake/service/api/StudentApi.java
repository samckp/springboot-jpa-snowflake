package com.sam.snowflake.service.api;

import com.sam.snowflake.service.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "student", description = "the Student API")
public interface StudentApi {

    @ApiOperation(value = "", response = Student.class, tags = {"Student",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful student record", response = Student.class)})
    @GetMapping(value = "/student",
            produces = {"application/json"})
    ResponseEntity<Student> getStudentById(@RequestParam("studentId") Long studentId);

    @ApiResponses(value = {@ApiResponse(code = 200, message = "All students record", response = Student.class)})
    @GetMapping("/all")
    ResponseEntity<List<Student>> getAllStudent();
}
