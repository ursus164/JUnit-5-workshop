package org.tasks.task3;

//Your task is to refactor the code below by using @BeforeEach decorator.
// Consider how the code is working. Can we refactor it to eliminate redundant code?
// If you don't have any ideas, look at the line 150 to see te "TIP_1" comment.
// If you still don't know what the author had in mind, check the line 210 to see the "TIP_2" comment.

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderTest  {
    private Order order;

    @BeforeEach
    void setup(){
        order = new Order();
    }
    @AfterEach
    void clear(){
        order.clearMeals();
    }

    @Test
    void mealListShouldBeEmptyAfterCreationOfOrder() {
//        Order order = new Order();
        assertThat(order.getMeals(), is(empty()));
    }

    @Test
    void mealListShouldBeEmptyAfterAddingMealToOrder(){
        Meal meal = new Meal(15, "Burger");
//        Order order = new Order();
        order.addMealToOrder(meal);
        assertThat(order.getMeals(), not(empty()));
        assertThat(order.getMeals().size(), is(equalTo(1)));
        order.cancel();
    }
    @Test
    void emptyOrderTotalCountOfMealsShouldEqualZero() {
//        Order order = new Order();
        assertThat(Order.countmeal_f, is(equalTo(0)));
    }

    @Test
    void addMealToOrderShouldIncreaseOrderSize() {
        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(27, "Sandwich");
//        Order order = new Order();
        order.addMealToOrder(meal);
        assertThat(order.getMeals(), hasSize(1));
        order.addMealToOrder(meal2);
        assertThat(order.getMeals(), hasSize(2));
    }
    @Test
    void removeMealFromOrderShouldDecreaseOrderSize() {
        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(27, "Sandwich");
//        Order order = new Order();
        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);
        order.removeMealFromOrder(meal);
        assertThat(order.getMeals(), hasSize(1));
    }
    @Test
    void orderTotalPriceShouldNotExceedMaxIntValue() {
        Meal meal = new Meal(Integer.MAX_VALUE, "Burger");
        Meal meal2 = new Meal(Integer.MAX_VALUE, "Sandwich");
//        Order order = new Order();
        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);
        assertThrows(IllegalStateException.class, () -> order.totalPrice());
    }

    @Test
    void emptyOrderTotalPriceShouldEqualZero() {
//       Order order = new Order();
        assertThat(order.totalPrice(), is(equalTo(0)));
    }

    @Test
    void cancelingOrderShouldRemoveAllItemsFromMealsList() {
//       Order order = new Order();
        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(27, "Sandwich");
        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);
        order.cancel();
        assertThat(order.getMeals(), empty());
    }

}









































































// Notice that in every test we use the same object from Order class -> we have redundant initializations.
// Maybe we should declare a field that is common to all methods in class?























































































// Declare a private field representing Order class object and initialize it in the
// method with @BeforeEach decorator. This will work as a setup, which is
// executed before each test method - so we will always have initialized object before running
// each test.