package com.big0soft.games.controller;

import com.big0soft.games.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ApplicationException {

    @ExceptionHandler(value = {
            RuntimeException.class,
            EmailExistsException.class,
            UsernameExistsException.class,
            EmptyValueException.class,
            MethodArgumentNotValidException.class,
            NotFoundException.class
    })
    public ResponseEntity<CustomErrorResponse> handleInvalidArgument(CustomRuntimeException exception) {
        CustomErrorResponse response = new CustomErrorResponse(
                LocalDateTime.now(),
                exception.getStateCode(),
                true,
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                exception.getMessage()
        );
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
