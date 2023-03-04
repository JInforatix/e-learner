package com.jinforatix.app.coursemanager.domain.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class CourseDTO {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private Instant creationDate;
    private Instant lastModified;

    public CourseDTO() {}

    public CourseDTO(Long id, String title, String description, BigDecimal price, Instant creationDate,
            Instant lastModified) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.creationDate = creationDate;
        this.lastModified = lastModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

}
