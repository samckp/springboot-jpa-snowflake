package com.sam.snowflake.service.repository;

import com.sam.snowflake.service.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query(value = "SELECT STUDENT_ID as \"student_id\", STUDENT_NAME as \"student_name\", CLASS_ID as \"class_id\" FROM STUDENT WHERE STUDENT_ID = ?", nativeQuery = true)
    public Student findStudentById(Long studentId);

    @Query(value = "SELECT STUDENT_ID as \"student_id\", STUDENT_NAME as \"student_name\", CLASS_ID as \"class_id\"  FROM STUDENT ", nativeQuery = true)
    public List<Student> findAllStudent();
}
