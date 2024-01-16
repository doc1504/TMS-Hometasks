package com.example.movie5.exc;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class MovieException extends RuntimeException{
    private String errorMessage;
    public MovieException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
