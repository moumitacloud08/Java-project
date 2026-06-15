package com.dspattern.creational.behavioral.chain.example3;

/**
 * Defines the contract for all the filters in the chain
 * <p>
 * Each filter performs a task and optionally delegates to the
 * next filter in the filter chain
 */
public interface Filter {

    void setNext(Filter filter);

    void apply(Request request);
}
