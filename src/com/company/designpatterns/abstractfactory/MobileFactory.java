package com.company.designpatterns.abstractfactory;

public class MobileFactory extends AbstarctDeviceFactory {

    @Override
    Device getDeviceType(DeviceType deviceType) {
        switch (deviceType){
            case ONEPLUS : return new Dell("ONEPLUS" , "12GB");
        }

        return null;
    }
}
