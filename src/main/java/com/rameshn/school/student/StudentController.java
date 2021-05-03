package com.rameshn.school.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private StudentServiceClass studentService;

    public StudentController(StudentServiceClass studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        return students;
    }
    @GetMapping("/students/{id}")
    public Student  getStudent(@PathVariable String id){
        Student student = studentService.getStudent(id);
        return student;
    }
    @PostMapping("/students/")
    public void  addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping ("/students/{id}")
    public void  updateStudent(@RequestBody Student student,@PathVariable long id){
        studentService.updateStudent(student,id);
    }
    @DeleteMapping("/students/{id}")
    public void  deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }
}
