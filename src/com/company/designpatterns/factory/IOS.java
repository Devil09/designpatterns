package com.company.designpatterns.factory;

public class IOS implements OS{
    @Override
    public void spec() {
        System.out.println("Secure OS");
    }
}
