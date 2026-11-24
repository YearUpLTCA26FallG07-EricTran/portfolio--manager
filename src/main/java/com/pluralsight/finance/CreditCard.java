package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable {

    private String name;
    private int accountNumber;
    private BigDecimal balance;

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    public void pay(double amount) {
        balance = balance.subtract(BigDecimal.valueOf(amount));
    }

    @Override
    public double getValue() {
        return balance.doubleValue();
    }
}