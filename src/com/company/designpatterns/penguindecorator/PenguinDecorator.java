package com.company.designpatterns.penguindecorator;

public class PenguinDecorator implements Penguin {

    Penguin penguin;

    public PenguinDecorator(Penguin penguin){
        this.penguin = penguin;
    }

    @Override
    public void getPenguin() {
        this.penguin.getPenguin();
    }
}
