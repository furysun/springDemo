package com.company.xmlbased;

public class FisherCat implements Cat {
    private Food food;

    public FisherCat(Food food) {
        this.food = food;
    }

    public void eat() {
        System.out.println("I like " + food.getName());
    }
}
