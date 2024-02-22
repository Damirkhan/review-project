package org.example.review.project.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorDetails {
    private HttpStatus httpStatus;
    private String message;
    private String details;

    public ErrorDetails(HttpStatus httpStatus, String message, String details) {
        super();
        this.httpStatus = httpStatus;
        this.message = message;
        this.details = details;
    }
}
