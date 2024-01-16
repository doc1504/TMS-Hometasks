package com.example.carstore.web.exc;

import com.example.carstore.dto.InternalCarStoreException;
import com.example.carstore.exc.CarFailedException;
import com.example.carstore.mapper.ErrorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RequiredArgsConstructor
@RestControllerAdvice
public class ErrorControllerHandler {
    private final ErrorMapper mapper;

    @ExceptionHandler(CarFailedException.class)

    public ResponseEntity<InternalCarStoreException> handle (CarFailedException exc) {
        return ResponseEntity.status(exc.getCode())
                .body(mapper.toIl(exc));
    }

}
