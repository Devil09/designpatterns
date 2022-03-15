package com.company.designpatterns.penguindecorator;

public class PenguinHat extends PenguinDecorator {
    public PenguinHat(Penguin penguin) {
        super(penguin);
    }

    @Override
    public void getPenguin() {
        super.getPenguin();
        System.out.println("Now Penguin got a hat");
    }
}
