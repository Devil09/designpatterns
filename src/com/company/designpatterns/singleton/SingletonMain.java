package com.company.designpatterns.singleton;

import com.company.designpatterns.factory.OS;
import com.company.designpatterns.factory.OperatingSystemFactory;

public class SingletonMain {

    private static SingletonMain obj;

    private SingletonMain() {

    }

    public static SingletonMain getInstance(){

        if (obj==null){
            obj = new SingletonMain();
        }

        return obj;
    }
}
