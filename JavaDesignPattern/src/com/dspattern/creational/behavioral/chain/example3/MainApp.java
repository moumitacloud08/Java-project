package com.dspattern.creational.behavioral.chain.example3;

public class MainApp {
    public static void main(String[] args){

        //create the filters
        Filter authFilter = new AuthFilter();
        Filter trimFilter = new TrimFilter();
        Filter logFilter = new LogFilter();
        Filter compressionFilter = new CompressionFilter();

        //Build the filter chain: Auth -> Trim -> Log -> Compression
        authFilter.setNext(trimFilter);
        trimFilter.setNext(logFilter);
        logFilter.setNext(compressionFilter);

        //Request #1: passes authentication
        Request request1 = new Request("   auth-user-request-1");

        //Start processing the request
        System.out.println("===Processing request1 (Authenticated) ===");
        authFilter.apply(request1);

        System.out.println("Final request state: "+request1);

        System.out.println();

        //Request #2: fails authentication
        Request request2 = new Request("  user-request-1");

        //Start processing the request
        System.out.println("===Processing request2 (Authentication fails) ===");
        authFilter.apply(request2);

        System.out.println("Final request state: "+request2);

        System.out.println();
        System.out.println("Demo complete - notice how Request2 stops early");


    }
}
