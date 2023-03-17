package com.abdulmo123.studentmanagement.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private Long id;
    private String name;
    private int age;
    @Column(nullable=false, updatable=false)
    private Long studentId;
    private String major;
    private String classLevel;
    private String imageUrl;

    public Student () {}

    public Student (String name, int age, Long studentId, String major, String classLevel, String imageUrl) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.classLevel = classLevel;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", classLevel='" + classLevel + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
