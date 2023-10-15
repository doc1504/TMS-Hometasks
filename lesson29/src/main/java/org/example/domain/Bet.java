package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bet {
    private Integer inputNumber;
    private Integer cost;
}
