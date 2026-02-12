package com.mohamed.lock.model;

public class Door {
    private DoorState state;

    public Door() {
        this.state = DoorState.CLOSED;
    }

    public DoorState getState() {
        return state;
    }

    public void setState(DoorState state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Door firstDoor = new Door();
        System.out.println(firstDoor.getState());
        firstDoor.setState(DoorState.OPEN);
        System.out.println(firstDoor.getState());
    }
}
