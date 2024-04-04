package org.tasks.task3;

public class Meal {
    private int price;
    private String name;

    public Meal(int i, String burger) {
        price += i;
        name = burger;
    }

    public int getPrice() {
        return this.price;
    }
    public String getName() {
        return this.name;
    }
}
