package org.example.domain;

import lombok.Data;

@Data
public class Bet {
    private Integer inputNumber;
    private Integer cost;

    public Bet(Integer inputNumber, Integer cost) {
        this.inputNumber = inputNumber;
        this.cost = cost;
    }
}
