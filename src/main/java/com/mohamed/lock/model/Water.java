package com.mohamed.lock.model;

public class Water {
    private double flowRate; // m3/s
    private double level; // m
    private double surface; // m2

    public Water() {
        this.level = 0;
        this.surface = 20;
    }

    private void setFlowRate(double flowRate) {
        this.flowRate = flowRate;
    }

    public static void main(String[] args) {
    }
}
