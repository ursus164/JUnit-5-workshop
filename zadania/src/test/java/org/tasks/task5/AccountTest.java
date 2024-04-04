package org.tasks.task5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import static org.junit.jupiter.api.Assertions.assertThrows;


// Here we have the basic set of tests for the Account class, including checking constructors, and methods.
// Your goal is to implement the missing test for the Account class. If you want to know what
// is the current test coverage for the Account class, you can do the following steps:

// 1. Open terminal in your IDE (you should be in the ROOT directory of the project - "zadania")

// 2. Type the following command: "mvn clean test" and press enter -> Note that all previous tests should be positive.

// 3. After the tests are successfully executed, you can check the test coverage by opening the following file in your browser:
//    target/site/jacoco/index.html (do it simply by right-clicking on the file and selecting "Open in Browser")

// 4. Once you enter the report, you can navigate to the "org.tasks.task5" , then "Account" class and then one of the provided methods -
//    for example, "setEmail".

// 5. You will see the actual test coverage of the current set of tests. Green color means that the line is covered by the test/ tests,
//    while red color means that the line is not covered.

// 6. Your goal is to implement the missing test/ tests to increase the test coverage of the Account class - you can do it by adding new
//    test methods to the AccountTest class.

// 7. Focus on the methods, or functionalities that are not checked by the current set of tests.

// 8. After adding new tests, repeat the steps 1-5 to check the new test coverage.

// 9. Good luck!

class AccountTest {

    @Test
    void accountCreatedWithoutAddressShouldBeInactive() {
        Account account = new Account();

        assertThat(account.isActive(), equalTo(false));
    }

    @Test
    void newAccountWithNotNullAddressShouldBeActive() {
        Account account = new Account(new Address("Street", "City"));

        assertThat(account.isActive(), equalTo(true));
    }

    @Test
    void newAccountShouldNotHaveDefaultDeliveryAddressSet() {
        Account account = new Account();

        assertThat(account.getDeliveryAddress(), equalTo(null));
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet() {
        Account account = new Account(new Address("Street", "City"));

        assertThat(account.getDeliveryAddress(), notNullValue());
    }

    @Test
    void invalidEmailShouldThrowException() {
        Account account = new Account();

        assertThrows(IllegalArgumentException.class, () -> {
            account.setEmail("this_is_invalid_email");
        });
    }
}