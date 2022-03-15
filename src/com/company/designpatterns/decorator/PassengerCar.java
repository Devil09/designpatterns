package com.company.designpatterns.decorator;

public class PassengerCar extends Decorator{

    public PassengerCar(Car car) {
        super(car);
    }

    @Override
    public void getDesign() {
        super.getDesign();
        System.out.println("This is a passenger car");
    }
}
