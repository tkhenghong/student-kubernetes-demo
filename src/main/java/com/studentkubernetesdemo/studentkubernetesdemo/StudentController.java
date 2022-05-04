package com.studentkubernetesdemo.studentkubernetesdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/student-records")
public class StudentController {

    private final StudentRepository studentRepository;
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @PostMapping(value = "/student", produces = "application/json")
    public Student saveStudent(@RequestBody Student student) {
        logger.info("Saving a new student");
        Student student1 = studentRepository.save(student);
        return student1;
    }

    @GetMapping(value = "/students", produces = "application/json")
    public List<Student> getStudents() {
        logger.info("Retrieving all students");
        return StreamSupport.stream(studentRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @GetMapping(value = "/students/{id}", produces = "application/json")
    public Optional<Student> getStudent(@PathVariable("id") Integer id) {
        logger.info("Retrieving student by id");
        return studentRepository.findById(id);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        logger.info("Deleting student by id");
        studentRepository.deleteById(id);
    }
}
