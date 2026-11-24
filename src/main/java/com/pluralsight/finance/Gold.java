package com.pluralsight.finance;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getValue() {
        // Add gold value calculation here
        return getMarketValue();
    }
}