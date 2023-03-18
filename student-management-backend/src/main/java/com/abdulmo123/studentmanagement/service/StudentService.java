package com.abdulmo123.studentmanagement.service;

import com.abdulmo123.studentmanagement.exception.StudentNotFoundException;
import com.abdulmo123.studentmanagement.model.Student;
import com.abdulmo123.studentmanagement.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Transactional
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student with id: " + id + " was not found"));
    }

    public Student addStudent(Student student) {
        student.setStudentId(1000 + new Random().nextLong(9000));
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudentById(id);
    }
}
