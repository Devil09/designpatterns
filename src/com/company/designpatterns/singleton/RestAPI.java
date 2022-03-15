package com.company.designpatterns.singleton;

public class RestAPI {

    static RestAPI restAPI = new RestAPI();

    private RestAPI(){

    }

    public static RestAPI getInstance(){
        return restAPI;
    }


}
