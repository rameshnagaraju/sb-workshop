package com.rameshn.school.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceClass {

    private List<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("1", "Mr X", "x@gmail.com", 21),
                    new Student("2", "Mr Y", "y@gmail.com", 21)
            ));

    public ArrayList<Student>  getAllStudents(){

        System.out.println("get All students invoked");
        return (ArrayList<Student>) students;

    }

    public Student getStudent(String id){
        System.out.printf("id is ", id);
        return students.
                stream().
                filter(s -> s.getId().equals(id)).findFirst().get();

    }

    public void  addStudent(Student student){
        System.out.printf("Add Student msg received  " ,student);
        students.add(student);
    }

    public void  updateStudent(Student student, long id){
        System.out.printf("In update Student method " ,student);
    }

    public void deleteStudent(long id){
        System.out.printf("In delete method id: " , id);
    }

}
