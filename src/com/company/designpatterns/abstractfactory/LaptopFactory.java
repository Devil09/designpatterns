package com.company.designpatterns.abstractfactory;

public class LaptopFactory extends AbstarctDeviceFactory {
    @Override
    Device getDeviceType(DeviceType deviceType) {
        switch (deviceType){
            case DELL : return new Dell("Rock" , "12GB");
        }

        return null;
    }
}
