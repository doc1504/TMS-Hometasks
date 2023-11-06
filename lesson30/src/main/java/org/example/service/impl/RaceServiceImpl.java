package org.example.service.impl;

import org.example.BenchMark;
import org.example.domain.Bet;
import org.example.domain.Pair;
import org.example.service.InputService;
import org.example.service.RaceService;
import org.example.service.WalletService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
@Service
public class RaceServiceImpl implements RaceService {
    private InputService inputService;
    private WalletService walletService;
    private List<Pair> pairs;
    private Bet inputNumber;
    private int winPair;

    public RaceServiceImpl(InputService inputService, WalletService walletService, List<Pair> pairs) {
        this.inputService = inputService;
        this.walletService = walletService;
        this.pairs = pairs;
    }
    @BenchMark
    @Override
    public void runRace() throws InterruptedException {
        inputNumber = inputService.inputPair();
        System.out.println(" Run race.........");
        for (int i = 0; i < 5; i++) {
            move();
            print();
            Thread.sleep(5000);
        }
        Optional<Pair> optionalPair = pairs.stream()
                .sorted(Comparator.comparingDouble(Pair::getDistance))
                .findFirst();
        winPair = optionalPair.get().getNumber();
        System.out.println(" Winner is: " + winPair);

    }
    @BenchMark
    @Override
    public void checkResult() {
        if (inputNumber.getInputNumber() == winPair) {
            walletService.add(inputNumber.getCost());
        } else {
            walletService.decr(inputNumber.getCost());
        }

    }
    public void move() {
        for (Pair pair : pairs) {
            pair.move();
        }
    }
    public void print() {
        for (Pair pair: pairs) {
            pair.print();
        }
    }
}
