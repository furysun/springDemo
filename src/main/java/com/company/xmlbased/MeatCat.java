package com.company.xmlbased;

public class MeatCat implements Cat {
    private Food food;

    public MeatCat(Food food) {
        this.food = food;
    }

    public void eat() {
        System.out.println("I like " + food.getName());
    }
}
