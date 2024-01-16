package com.example.carstore1.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternalCarException {
    private String errorDetails;
    private String serviceName;
    private Integer code;
    private String action;
}
