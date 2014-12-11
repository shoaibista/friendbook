package com.semanticbits.friendbook.controller;

import com.semanticbits.friendbook.controller.command.StudentCommand;
import com.semanticbits.friendbook.controller.validator.StudentValidator;
import com.semanticbits.friendbook.domain.School;
import com.semanticbits.friendbook.propertyeditors.SchoolPropertyEditor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import java.util.*;

/**
 * Created by shoaib on 2/11/14.
 */
@Controller
@RequestMapping("/studentRegistration")
public class StudentDetailsController {

    private static final Logger logger = Logger.getLogger(StudentDetailsController.class);

    public StudentDetailsController() {
        System.out.println("In Student Constructor my shoaib");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        logger.debug("In init binder");

        /**
         *   binding custom validator to databinder we need to add validator instance.
         *  */
        binder.setValidator(new StudentValidator());

        /*
        * If you are using annotations and as well as init binder method then
        * you should called below method to bind the validator to databinder.
        * */
//        binder.validate();


        /*
        * Registering custom property configurer.
        * */
        binder.registerCustomEditor(School.class,new SchoolPropertyEditor());

    }

    @RequestMapping(method=RequestMethod.GET)
    public String showForm(ModelMap map){
        StudentCommand command =new StudentCommand();
        command.setSubjects(Arrays.asList(new String[]{"Spring"}));
        map.addAttribute("command", command);
        return "studentregistration";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String processForm(@ModelAttribute("command") @Validated StudentCommand command,
                              BindingResult errors,SessionStatus status,ModelMap map){

        if(errors.hasErrors()){
            map.addAttribute("hasErrors",true);
            return "studentregistration";
        }

        status.setComplete();

        return "studentdetail";
    }

    @ModelAttribute("subjects")
    public List<String> referenceData(){
        List<String> subjects=new ArrayList<String>();
        subjects.add("Java");
        subjects.add("Spring");
        subjects.add("Hibernate");

        return subjects;
    }
}
