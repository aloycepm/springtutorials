/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorials.spring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Ecyola
 */
@Entity // This tells Hibernate to make a table out of this class
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String sex;
    private String status;

    public Student() {
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(String firstName, String lastName, String sex, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + '}';
//    }

}
