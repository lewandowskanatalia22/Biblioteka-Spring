package com.sda.springstarter.demo.exceprion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptinHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handlleException (BookNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono rekordu","Błąd"));
    }

}
