package com.mohamed.lock.model;

public class Valve {
    private double opening;

    public Valve(){
        setOpening(0.0);
    }

    public void setOpening(double opening){
        if (opening < 0.0 || opening > 1.0) throw new IllegalArgumentException("Opening must be in [0,1]");

        this.opening = opening;
    }

    public double getOpening(){
        return opening;
    }

    public boolean isOpen(){
        return opening > 0.0;
    }
}
