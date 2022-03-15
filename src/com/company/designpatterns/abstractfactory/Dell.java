package com.company.designpatterns.abstractfactory;

public class Dell extends Device {
    String procerssor;
    String ram;

    Dell(String processor, String ram){
        this.procerssor = processor;
        this.ram = ram;
    }


    @Override
    String getDevice() {
        return "This is Dell" + procerssor + ram;
    }
}
