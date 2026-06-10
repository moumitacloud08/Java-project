package com.dspattern.creational.builder.example3;

import java.util.Objects;

public class Meal {
    //Required
    private final Burger burger;

    //optional
    private final Drink drink;
    private final Fries fries;

    //private meal constructor used only by the Builders
    private Meal(Builder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }

    //static inner Builder for constructing meal objects
    public static class Builder {
        private final Burger burger;

        private Drink drink;
        private Fries fries;

        public Builder(Burger burger) {
            this.burger = Objects.requireNonNull(burger, "burger must not be null");
        }

        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder fries(Fries fries) {
            this.fries = fries;
            return this;
        }
        public Meal build(){
            return new Meal(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "burger=" + burger +
                    ", drink=" + drink +
                    ", fries=" + fries +
                    '}';
        }

        public Burger getBurger() {
            return burger;
        }

        public Drink getDrink() {
            return drink;
        }

        public Fries getFries() {
            return fries;
        }
    }
}
