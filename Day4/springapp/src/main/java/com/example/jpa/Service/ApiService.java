package com.example.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.Models.Student;
import com.example.jpa.Repositories.StudentRepo;

@Service
public class ApiService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student updateStudentById(int id, Student student) {
        Student existingStudent = studentRepo.findById(id).orElse(null);
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setDepartmentName(student.getDepartmentName());
        existingStudent.setMailid(student.getMailid());
        return studentRepo.save(existingStudent);
    }

    public boolean deleteStudentById(int id) {
        try {
            studentRepo.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
