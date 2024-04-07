package org.tasks.task1;

// You have been provided with a Calculator class containing various mathematical methods.
// In package "test/java/org/tasks/task1" you will find a test class with initial tests for this class.
// However, some of them are missing. Your task is to write missing unit tests for the Calculator class to
// identify any implementation errors and validate the correctness of the remaining methods.

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += b;
        }
        return result;
    }

    public int divide(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int power(int base, int exponent){
        int result = 1;
        for (int i = 0; i<exponent; i++){
            result = result * base;
        }
        return result;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i + 1;
        }
        return result;
    }

}
