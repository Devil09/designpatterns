package com.company.designpatterns.abstractfactory;


public class DeviceClient {

    public static void main(String a[]){

        Device dell = new BigFactory().getFactory(FactoryType.LAPTOP).getDeviceType(DeviceType.DELL);
        System.out.println(dell.getDevice());

    }
}
