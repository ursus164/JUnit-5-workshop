package org.tasks.task5;

// Given class representing an account with an email address, delivery address and active status.
// If a user creates an account without providing a delivery address, the account is considered as inactive.
// However, if a user provides a delivery address, the account is set as active.
//
// When setting user email, application validates if it is in the correct format (by regular expression).
// If so, account email is set to provided email. If not, IllegalArgumentException is thrown.
//
// In package "test/java/org/tasks/task5" you will find a test class with initial tests for this class.
// However, some of them are missing. Get familiar with structure, and methods of "Account" and "Address" classes provided
// in this package and then navigate to the corresponding test class for the rest of the task.

import org.tasks.task5.Address;

public class Account {
    private boolean active;
    private Address deliveryAddress;
    private String email;

    public Account() {
        active = false;
    }

    public Account(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;

        if(deliveryAddress != null) {
            activate();
        } else {
            active = false;
        };
    }

    public void setEmail(String email) {
        this.email = email;

        if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            // regex validation if email is in the correct format
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address format!");
        }
    }
    public void activate() {
        active = true;
    }
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getEmail() {
        return email;
    }
    public boolean isActive() {
        return active;
    }
}
