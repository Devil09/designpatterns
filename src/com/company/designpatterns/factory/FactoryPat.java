package com.company.designpatterns.factory;

public class FactoryPat {

    public static void main(String a[]){

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS os = operatingSystemFactory.getInstance("open");
        os.spec();
    }
}
