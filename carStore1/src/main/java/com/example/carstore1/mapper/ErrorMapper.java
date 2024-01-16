package com.example.carstore1.mapper;
import com.example.carstore1.dto.InternalCarException;
import com.example.carstore1.exc.CarFailedException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(
        componentModel = "spring"
)
public interface ErrorMapper {
    @Mapping(target = "errorDetails", source = "errorMessage")
    @Mapping(target = "serviceName", source = "serviceName")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "action", constant = "try again")
    InternalCarException toIntern (CarFailedException exc);
}
