package com.nestdigital.CourseApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to our homepage";
    }
    @GetMapping("/student")
    public String StudentDetails()
    {
        return "Enter the details of the students";
    }
    @GetMapping("/course")
    public String CourseReg()
    {
        return "Register your Course with full details";
    }
    @GetMapping("/search")
    public String SearchCourse()
    {
        return "Search your Details";
    }
}
