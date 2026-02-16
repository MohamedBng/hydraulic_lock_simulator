package com.mohamed.lock.model;

public class Door {
    private DoorState state;
    private WaterBody leftSide;
    private WaterBody rightSide;

    public Door(WaterBody leftSide, WaterBody rightSide) {
        this.state = DoorState.CLOSED;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public DoorState getState() {
        return state;
    }

    public boolean canOpen(){
        return rightSide.getLevel() == leftSide.getLevel();
    }

    public void openDoor(){
        if(canOpen()) {
            setState(DoorState.OPEN);
        } else {
            setState(DoorState.CLOSED);
        }
    }

    public void setState(DoorState state) {
        this.state = state;
    }
}
