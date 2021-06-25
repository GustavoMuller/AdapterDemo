package org.kodigo.demo;

public class Service {
    public String getData(String xml){
        System.out.println("Service called...");
        return xml.equals("I am XML") ? "Returned XML data" : "Invalid input";
    }
}
