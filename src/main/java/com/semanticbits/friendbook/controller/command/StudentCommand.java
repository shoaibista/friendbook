package com.semanticbits.friendbook.controller.command;

import com.semanticbits.friendbook.domain.School;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by shoaib on 2/14/14.
 */
public class StudentCommand {

//    @NumberFormat(style= NumberFormat.Style.NUMBER)
    private int age;
    @NotNull(message = "Please enter name")
    private String name;
    @NotNull(message = "Please enter city")
    private String city;
    private School school;
    private List<String> subjects;

    public StudentCommand(){
        school=new School();
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
