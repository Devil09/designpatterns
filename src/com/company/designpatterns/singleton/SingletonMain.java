package com.company.designpatterns.singleton;

import com.company.designpatterns.factory.OS;
import com.company.designpatterns.factory.OperatingSystemFactory;

public class SingletonMain {

    public static void main(String a[]){

        RestAPI restAPI = RestAPI.getInstance();
    }
}
