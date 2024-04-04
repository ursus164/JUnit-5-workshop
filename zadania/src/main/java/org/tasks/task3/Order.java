package org.tasks.task3;

// Given The Order class represents an order containing a list of Meal objects.
// It provides methods to add meal to the order, remove the meal from the order/
// retrieve the list of meals in the order, calculate the total price of the order,
// and cancel the order.
// In package "test/java/org/tasks/task3" you will find a test class with initial tests for this class.
// Your task will be to refactor code in the class OrderTest to make it better and more clear

import java.util.ArrayList;
import java.util.List;

public class Order {
    public static int countmeal_f = 0;

    private List<Meal> meals = new ArrayList<>();

    public void addMealToOrder(Meal meal) {
        meals.add(meal);
        countmeal_f +=1;
    }

    public void removeMealFromOrder(Meal meal){
        meals.remove(meal);
        countmeal_f -=1;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public int totalPrice() {
        int total = 0;
        for (Meal meal: meals){
            total += meal.getPrice();
        }
        if (total < 0) {
            throw new IllegalStateException("Total price exceeds maximum value.");
        }
        return (int)total;
    }

    public void cancel() {
        meals.clear();
        if (countmeal_f > 0) {
            countmeal_f -= 1;
        }
    }
    public void clearMeals(){
        meals.clear();
        countmeal_f = 0;
    }
}
