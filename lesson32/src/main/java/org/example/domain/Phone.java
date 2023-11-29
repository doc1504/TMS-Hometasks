package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @NotBlank(message = "Please, fill this field")
    private String model;
    @NotNull
    @Min(value = 1000, message = "too cheap") @Max(value = 5000, message = "too expensive")
    private Integer value;
}
