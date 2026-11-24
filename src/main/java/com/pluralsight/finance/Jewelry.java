package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double karat) {
        super(name, 0);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    @Override
    public double getValue() {
        // Add jewelry value calculation here
        return getMarketValue();
    }
}