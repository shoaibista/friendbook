package com.semanticbits.friendbook.propertyeditors;

import com.semanticbits.friendbook.domain.School;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * Created by shoaib on 2/14/14.
 */
@Component
public class SchoolPropertyEditor extends PropertyEditorSupport{


    public void setAsText(String text){
        System.out.println("text......"+text);
        School school=new School();
        school.setSchoolName((text.equals("null")||(text!=null))?text:"");
        System.out.println(school.getSchoolName());
        setValue(school);
    }
}
