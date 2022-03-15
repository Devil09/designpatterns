package com.company.designpatterns.abstractfactory;

public class OnePlus extends Device {
    String procerssor;
    String ram;

    OnePlus(String processor, String ram){
        this.procerssor = processor;
        this.ram = ram;
    }


    @Override
    String getDevice() {
        return "This is Oneplus" + procerssor + ram;
    }
}
