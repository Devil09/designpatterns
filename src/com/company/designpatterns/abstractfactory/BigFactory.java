package com.company.designpatterns.abstractfactory;

public class BigFactory {

      public AbstarctDeviceFactory getFactory(FactoryType factoryType){
          return switch (factoryType) {
              case LAPTOP -> new LaptopFactory();
              case MOBILE -> new MobileFactory();
          };

      }
}
