package org.example.web;

import org.example.exception.PhoneNameException;
import org.example.exception.ValueException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(PhoneNameException.class)
    public String processorError (PhoneNameException exc) {
        System.out.println("Error " + exc.getPhone());
        return "modelError";
    }
    @ExceptionHandler(ValueException.class)
    public String valueError (ValueException exc) {
        System.out.println("Error " + exc.getPhone());
        return "valueError";
    }
}
