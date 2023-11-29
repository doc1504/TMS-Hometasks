package org.example.exception;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.Phone;
@Getter @Setter
public class ValueException extends RuntimeException{

    private Phone phone;

    public ValueException(Phone phone) {
        this.phone = phone;
    }
}
