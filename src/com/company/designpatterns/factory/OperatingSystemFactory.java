package com.company.designpatterns.factory;

public class OperatingSystemFactory {

    public OS getInstance(String str){

        if (str.equalsIgnoreCase("open")){
            return new Android();
        }

        else if(str.equalsIgnoreCase("closed")){
            return new IOS();
        }

        else return new Windows();


    }
}
