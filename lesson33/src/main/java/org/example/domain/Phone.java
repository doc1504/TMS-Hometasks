package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @NotEmpty(message = "Please, fill this gape")
    private String model;
    @NotNull(message = "Please, fill this gape")
    @Min(value = 1000, message = "too cheap")  @Max(value = 5000, message = "too expensive")
    private Integer value;
}
