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
        //Required
        private final Burger burger;

        //Optional
        private Drink drink;
        private Fries fries;

        //Builder constructor for required field
        public Builder(Burger burger) {
            this.burger = Objects.requireNonNull(burger, "burger must not be null");
        }

        //Setter for optional drink
        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }
        //Setter for optional fries
        public Builder fries(Fries fries) {
            this.fries = fries;
            return this;
        }
        public Meal build(){
            return new Meal(this);
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

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", fries=" + fries +
                '}';
    }
}
