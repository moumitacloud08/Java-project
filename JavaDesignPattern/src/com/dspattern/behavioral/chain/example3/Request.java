package com.dspattern.behavioral.chain.example3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Refactoring - example1
 * Represents a simple request object used in the chain of Responsibility pattern
 * Each filter can read or modify its state
 * (authentication,logging,compressed...)
 */
public class Request {

    //The actual request data being processed
    private String payload;

    //Reference to the attributes
    Map<String,Object> attributes = new LinkedHashMap<>();

    public Request(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public void setAttributes(String key, Object value) {
       attributes.put(key,value);
    }

    @Override
    public String toString() {
        return "Request{" +
                "payload='" + payload + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
