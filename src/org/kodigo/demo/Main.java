package org.kodigo.demo;

public class Main {

    public static void main(String[] args) {
	    Data data = new Data();
	    DataAdapter adapter = new DataAdapter();

        System.out.println("Client wants data from service");
        System.out.println("Client got: " + data.getData());

        System.out.println("\n\n Using ADAPTER design pattern");
        System.out.println("Client got: " + adapter.getData());
    }
}
