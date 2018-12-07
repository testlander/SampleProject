package steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class Stepdefs implements En {
    public Stepdefs() {
        Given("^I navigate to the login page$", () -> {
            System.out.println("I navigate to the login page");
        });
        And("^I ensure that I am at the login page$", () -> {
            System.out.println("I ensure that I am at the login page");
        });
    }
}
