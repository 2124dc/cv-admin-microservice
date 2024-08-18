package com.app.cv.exception.handler;

import com.app.cv.exception.InvalidCredentialsException;
import com.app.cv.exception.NotFountException;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.rmi.ServerException;

@ControllerAdvice
public class Admin_Ms_ExceptionHandler {

    private static class ErrorResponse {
        @JsonProperty("statusCode")
        private int statusCode;
        @JsonProperty("message")
        private String message;

        public ErrorResponse() {
            // Initialize fields if needed
        }

        public ErrorResponse(int statusCode, String message) {
            this.statusCode = statusCode;
            this.message = message;
        }
    }

    @ExceptionHandler(NotFountException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(NotFountException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleServerException(InvalidCredentialsException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
    }
}
