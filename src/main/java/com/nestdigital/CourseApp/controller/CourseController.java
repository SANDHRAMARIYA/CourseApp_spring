package com.nestdigital.CourseApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to our homepage";
    }

    @GetMapping("/course")
    public String CourseReg()
    {
        return "Register your Course with full details";
    }
    @PostMapping("/read")
    public String Readpage()
    {
        return "Read Page";
    }
    @GetMapping("/viewall")
    public List view()
    {
        List<String> mylist = new ArrayList<>();
        mylist.add("{'name':'Anna','age':20}");
        return mylist;
    }

}
