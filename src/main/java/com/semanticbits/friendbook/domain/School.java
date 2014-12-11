package com.semanticbits.friendbook.domain;

/**
 * Created by shoaib on 2/14/14.
 */
public class School {

    private int id;
    private String schoolName;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return "";
    }
}
