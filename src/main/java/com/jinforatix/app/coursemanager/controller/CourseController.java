package com.jinforatix.app.coursemanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinforatix.app.coursemanager.domain.dto.AuthorDTO;
import com.jinforatix.app.coursemanager.domain.dto.CourseDTO;
import com.jinforatix.app.coursemanager.service.CourseService;


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
