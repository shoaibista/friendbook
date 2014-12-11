package com.semanticbits.friendbook.controller.validator;

import com.semanticbits.friendbook.controller.command.StudentCommand;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by shoaib on 2/14/14.
 */

public class StudentValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return StudentCommand.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        StudentCommand command=(StudentCommand)o;
        if(command.getAge()<1){
            errors.rejectValue("name","age.invalid","Age is invalid");
        }
        if(CollectionUtils.isEmpty(command.getSubjects())){
            errors.rejectValue("subjects","subjects.empty","Select atleast one subject");
        }
        ValidationUtils.rejectIfEmpty(errors,"school.schoolName","schoolName.empty");
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        ValidationUtils.rejectIfEmpty(errors, "city", "city.empty");
    }
}


