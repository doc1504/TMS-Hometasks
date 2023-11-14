package org.example.service.impl;

import org.example.service.WalletService;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {
    private Integer defaultSum = 10000;
    @Override
    public void add(int cost) {
        defaultSum = defaultSum + cost;
        System.out.println("You win! Your sum is: " + defaultSum);

    }

    @Override
    public void decr(int cost) {
        defaultSum = defaultSum - cost;
        System.out.println(" You fail. Your sum is: " + defaultSum);

    }
}
