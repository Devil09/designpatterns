package com.company.designpatterns.penguindecorator;

public class BluePenguin extends PenguinDecorator {
    public BluePenguin(Penguin penguin) {
        super(penguin);
    }

    @Override
    public void getPenguin() {
        super.getPenguin();
        System.out.println("This is blue penguin");
    }
}
