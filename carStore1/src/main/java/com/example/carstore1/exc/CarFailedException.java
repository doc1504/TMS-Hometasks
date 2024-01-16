package com.example.carstore1.exc;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class CarFailedException extends RuntimeException{
    @JsonProperty("message")
    private final String errorMessage;
    private final String serviceName;
    private final Integer code;
    public CarFailedException(String errorMessage, String serviceName, Integer code) {
        this.errorMessage = errorMessage;
        this.serviceName = serviceName;
        this.code = code;
    }
}
