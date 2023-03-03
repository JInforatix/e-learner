package com.jinforatix.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinforatix.app.domain.dto.AuthorDTO;
import com.jinforatix.app.domain.dto.CourseDTO;
import com.jinforatix.app.domain.model.Author;
import com.jinforatix.app.domain.model.Course;
import com.jinforatix.app.repository.AuthorRepository;
import com.jinforatix.app.repository.CourseRepository;

@Service
@Transactional
public class CourseService {

    private AuthorRepository authorRepository;
    private CourseRepository courseRepository;

    public CourseService(AuthorRepository authorRepository, CourseRepository courseRepository) {
        this.authorRepository = authorRepository;
        this.courseRepository = courseRepository;
    }

    public List<AuthorDTO> getAllAuthors() {
        var authors = authorRepository.findAll();
        return authors.stream()
            .map(this::convertToDto)
            .collect(Collectors.toList());
    }

    public List<CourseDTO> getAllCourses() {
        var courses = courseRepository.findAll();
        return courses.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private AuthorDTO convertToDto(Author author) {
        return new AuthorDTO(author.getId(), author.getFirstName(), author.getLastName());
    }


    private CourseDTO convertToDto(Course course) {
        return new CourseDTO(course.getId(), course.getTitle(),
                course.getDescription(), course.getPrice(),
         course.getCreationDate(), course.getLastModified());
    }

    protected Course convertToEntity(CourseDTO courseDto) {
        Course course = new Course();
        course.setTitle(courseDto.getTitle());
        course.setPrice(courseDto.getPrice());
        // map remaining data
        return course;
    }

}
