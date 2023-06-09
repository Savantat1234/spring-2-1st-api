package com.hindustaniBhau.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @Column(name="id")
    private int rollNo;
    private String name;
    private int age;
    private String mobNo;

    public User(){

    }
    public User(int rollNo, String name, int age, String mob_no) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getMob_no() {
        return mobNo;
    }

    public void setMob_no(String mobNo) {
        this.mobNo = mobNo;
    }
}
