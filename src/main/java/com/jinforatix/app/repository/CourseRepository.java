package com.jinforatix.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinforatix.app.domain.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
