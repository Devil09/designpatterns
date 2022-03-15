package com.company.designpatterns.penguindecorator;

import com.company.designpatterns.decorator.BasicCar;
import com.company.designpatterns.decorator.Car;
import com.company.designpatterns.decorator.LuxuryCar;
import com.company.designpatterns.decorator.PassengerCar;

public class PenguinMain {

    public static void main(String a[]){

        Penguin penguin = new BasicPenguin();
        //penguin.getPenguin();

        System.out.println("====== Special PENGUIN");

        Penguin penguin1 = new BluePenguin(new PenguinHat(penguin));
        penguin1.getPenguin();


    }



}
