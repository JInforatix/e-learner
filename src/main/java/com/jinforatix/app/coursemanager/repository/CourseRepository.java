package com.jinforatix.app.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinforatix.app.coursemanager.domain.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
