package com.sda.springstarter.demo.exceprion;

import com.sda.springstarter.demo.model.Publisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptinHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handlleException(BookNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Błąd"));
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity handlleException(AuthorNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Błąd"));
    }
    @ExceptionHandler(PublisherNotFoundException.class)
    public ResponseEntity handlleException(PublisherNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Błąd"));
    }
    @ExceptionHandler(BookCategoryNotFoundException.class)
    public ResponseEntity handlleException(BookCategoryNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu", "Błąd"));
    }
}
