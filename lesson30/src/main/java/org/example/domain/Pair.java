package org.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Pair {
    private Integer number;
    private Horse horse;
    private Rider rider;
    private Double speed;
    private Double distance;

    public void move() {
        distance += distance + speed* Math.random();
    }

    public void print() {
        for (int i = 0; i < distance; i++) {
            System.out.println(".");

        }
        System.out.println(number);
    }

}
