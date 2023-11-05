package org.example.domain;

import lombok.Data;

@Data

public class Pair {
    private Integer number;
    private Horse horse;
    private Rider rider;
    private Double speed;
    private Double distance;

    public Pair(Integer number, Horse horse, Rider rider, Double speed, Double distance) {
        this.number = number;
        this.horse = horse;
        this.rider = rider;
        this.speed = speed;
        this.distance = distance;
    }

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
