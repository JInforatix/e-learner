package com.jinforatix.app.coursemanager.domain.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record CourseDTO(Long id, String title, String topic, String description,
        BigDecimal price, Instant creationDate, Instant lastModified) {

}
