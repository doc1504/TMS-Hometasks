package com.example.carstore1.web.exc;
import com.example.carstore1.dto.InternalCarException;
import com.example.carstore1.exc.CarFailedException;
import com.example.carstore1.mapper.ErrorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RequiredArgsConstructor
@RestControllerAdvice
public class ErrorControllerHandler {
    private final ErrorMapper mapper;
    @ExceptionHandler(CarFailedException.class)
    public ResponseEntity<InternalCarException> handle (CarFailedException exc) {
        return ResponseEntity.status(exc.getCode())
                .body(mapper.toIntern(exc));
    }
}
