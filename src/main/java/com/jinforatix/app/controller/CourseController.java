package com.jinforatix.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinforatix.app.domain.dto.AuthorDTO;
import com.jinforatix.app.domain.dto.CourseDTO;
import com.jinforatix.app.service.CourseService;


@RestController
@RequestMapping("/api")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/authors")
    public List<AuthorDTO> authors() {
        return courseService.getAllAuthors();
    }

    @GetMapping("/courses")
    public List<CourseDTO> courses() {
        return courseService.getAllCourses();
    }


    
}
