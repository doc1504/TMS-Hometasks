package com.example.carstore.mapper;

import com.example.carstore.dto.InternalCarStoreException;
import com.example.carstore.exc.CarFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (
        componentModel = "spring"
)
public interface ErrorMapper {
    @Mapping(target = "errorDetails", source = "errorMessage")
    @Mapping(target = "serviceName", source = "serviceName")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "action", constant = "try again")
    InternalCarStoreException toIl(CarFailedException exc);
}
