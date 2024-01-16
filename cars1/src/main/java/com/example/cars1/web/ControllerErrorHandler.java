package com.example.cars1.web;
import com.example.cars1.exc.CarFailedException;
import com.example.cars1.exc.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ControllerErrorHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handle (CarFailedException exc) {
        String errorMessage = exc.getErrorMessage();
        ErrorDetails errorDetails = ErrorDetails.builder()
                .serviceName("car-service")
                .message(errorMessage)
                .code(400)
                .build();
        return ResponseEntity.status(400)
                .body(errorDetails);
    }
}
