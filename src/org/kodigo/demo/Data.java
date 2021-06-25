package org.kodigo.demo;

public class Data {
    Service service;

    public Data(){
        service = new Service();
    }

    public String getData(){
        System.out.println("App calls service...");
        return service.getData(getJson());
    }

    protected String getJson(){
        return "I am JSON";
    }
}
