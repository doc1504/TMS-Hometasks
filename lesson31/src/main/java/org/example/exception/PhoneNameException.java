package org.example.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.Phone;
@Getter @Setter
public class PhoneNameException extends RuntimeException{

    private Phone phone;

    public PhoneNameException(Phone phone) {
        this.phone = phone;
    }
}
