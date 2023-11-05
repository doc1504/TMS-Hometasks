package org.example.service.impl;

import org.example.domain.Bet;
import org.example.domain.Pair;
import org.example.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
@Service
public class InputServiceImpl implements InputService {

    private List<Pair> pairs;

    public InputServiceImpl(List<Pair> pairs) {
        this.pairs = pairs;
    }

    @Override
    public Bet inputPair() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер пары");
         int inputNumber = scanner.nextInt();
         if (inputNumber> pairs.size()) {
             System.out.println("Error. Try again");
             return inputPair();
         }
         return new Bet(inputNumber, 1000);


    }
}
