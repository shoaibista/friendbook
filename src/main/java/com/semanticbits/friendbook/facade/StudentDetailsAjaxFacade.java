package com.semanticbits.friendbook.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shoaib on 2/17/14.
 */
public class StudentDetailsAjaxFacade {


    public List<String> allRegisteredStudents(){
        List<String> students=new ArrayList<String>();

        System.out.println("Student Ajax Facade");
        students.add("Shoaib Chikate");
        students.add("Praveen Yagati");
        students.add("Ashok Dongare");
        students.add("Dileep Karjala");
        students.add("Snehalata Kulkarni");

        return students;
    }




}
