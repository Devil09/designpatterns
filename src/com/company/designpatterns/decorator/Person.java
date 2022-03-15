package com.company.designpatterns.decorator;

import com.company.designpatterns.singleton.RestAPI;

public class Person {

    public static void main(String a[]){

        BasicCar basicCar = new BasicCar();

        //Car passengerCar =  new PassengerCar(basicCar);
        ///passengerCar.getDesign();

        Car lux =  new LuxuryCar(new PassengerCar(basicCar));
        lux.getDesign();

    }
}
