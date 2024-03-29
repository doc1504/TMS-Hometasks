package com.example.cars1.exc;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class CarFailedException extends RuntimeException{
    private final String errorMessage;
    public CarFailedException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
