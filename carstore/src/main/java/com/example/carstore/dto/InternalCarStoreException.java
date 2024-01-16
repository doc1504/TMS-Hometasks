package com.example.carstore.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternalCarStoreException {

    private String errorDetails;
    private String serviceName;
    private Integer code;
    private String action;
}
