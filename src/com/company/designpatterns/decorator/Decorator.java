package com.company.designpatterns.decorator;

public class Decorator implements Car{

    private Car car;

    public Decorator(Car car){
        this.car = car;
    }
    @Override
    public void getDesign() {
        this.car.getDesign();
    }
}
