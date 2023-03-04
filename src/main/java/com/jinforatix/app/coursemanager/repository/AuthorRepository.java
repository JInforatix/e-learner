package com.jinforatix.app.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinforatix.app.coursemanager.domain.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}
