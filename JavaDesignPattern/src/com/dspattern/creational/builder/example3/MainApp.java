package com.dspattern.creational.builder.example3;

public class MainApp {
    public static void main(String[] args){

        //Create meal with required burger and optional drink
        Meal meal1 = new Meal.Builder(Burger.VEG)
                .drink(Drink.COKE)
                .build();
        System.out.println(meal1);

        Meal meal2 = new Meal.Builder(Burger.CHEESE_BURGER)
                .drink(Drink.COKE)
                .fries(Fries.SWEET_POTATO_FRIES)
                .build();

        System.out.println(meal2);

    }
}
