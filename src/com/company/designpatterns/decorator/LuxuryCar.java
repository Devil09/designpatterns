package com.company.designpatterns.decorator;

public class LuxuryCar extends Decorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void getDesign() {
        super.getDesign();
        System.out.println("This is a luxury car");
    }
}
