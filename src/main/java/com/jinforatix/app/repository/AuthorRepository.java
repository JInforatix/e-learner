package com.jinforatix.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinforatix.app.domain.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}
