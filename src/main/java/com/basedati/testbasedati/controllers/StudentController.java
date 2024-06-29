package com.basedati.testbasedati.controllers;


import com.basedati.testbasedati.DAO.StudentDAO;
import com.basedati.testbasedati.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentDAO.save(student);
    }

}
