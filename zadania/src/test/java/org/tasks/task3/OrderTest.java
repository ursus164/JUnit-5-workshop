package org.tasks.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertThrows;


// INTRODUCTION
// In JUnit 5, the @BeforeEach and @AfterEach annotations are used to signal that the annotated method should be executed before or after each test method in the class.

// @Before each annotation is used to execute a method before each test method in a class.
// @AfterEach annotation is used to execute a method after each test method in a class.

// You can check the documentation for more information about the usage of these decorators.


// Your task is to refactor the code below by using @BeforeEach and @AfterEach decorator to get all tests green.

// The Order class represents an order containing a list of Meal objects.
// Consider how the code is working. Can we refactor it to eliminate redundant code?

// If you don't have any ideas, look at line 150 to see the "TIP_1" comment.

// Does the code work now as intended? Do all tests pass? If not, try to find the issue. Consider if we
// have our "workspace" cleaned after initializing an object before each test method. Note that each test should be independent of others.
// It is unacceptable to have a situation where one test affects the result of another test.

// If you still don't know what the author had in mind, check line 210 to see the "TIP_2" comment.


public class OrderTest  {

    @Test
    void mealListShouldBeEmptyAfterCreationOfOrder() {
        Order order = new Order();

        assertThat(order.getMeals(), is(empty()));
    }

    @Test
    void mealListShouldBeEmptyAfterAddingMealToOrder(){
        Order order = new Order();

        Meal meal = new Meal(15, "Burger");

        order.addMealToOrder(meal);
        assertThat(order.getMeals(), not(empty()));
        assertThat(order.getMeals().size(), is(equalTo(1)));
        order.cancel();
    }
    @Test
    void emptyOrderTotalCountOfMealsShouldEqualZero() {
        Order order = new Order();

        assertThat(Order.countmeal_f, is(equalTo(0)));
    }

    @Test
    void addMealToOrderShouldIncreaseOrderSize() {
        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(27, "Sandwich");

        Order order = new Order();

        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);

        assertThat(order.getMeals(), hasSize(2));
    }
    @Test
    void removeMealFromOrderShouldDecreaseOrderSize() {
        Order order = new Order();

        Meal meal = new Meal(15, "Burger");
        Meal meal2 = new Meal(27, "Sandwich");

        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);
        order.removeMealFromOrder(meal);
        assertThat(order.getMeals(), hasSize(1));
    }
    @Test
    void orderTotalPriceShouldNotExceedMaxIntValue() {
        Order order = new Order();


        Meal meal = new Meal(Integer.MAX_VALUE, "Burger");
        Meal meal2 = new Meal(Integer.MAX_VALUE, "Sandwich");

        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);

        assertThrows(IllegalStateException.class, () -> order.totalPrice());
    }

    @Test
    void emptyOrderTotalPriceShouldEqualZero() {
       Order order = new Order();

        assertThat(order.totalPrice(), is(equalTo(0)));
    }

    @Test
    void cancelingOrderShouldRemoveAllItemsFromMealsList() {

       Order order = new Order();

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
// method with @BeforeEach decorator.
//
// This will work as a setup, which is executed before each test method - so we will always have initialized
// an object before running each test.
//
// However, some test still fails - it is caused by a static field which is not cleaned after use.
// Other tests may be affected by this, and therefore it is possible that they will show incorrect results.