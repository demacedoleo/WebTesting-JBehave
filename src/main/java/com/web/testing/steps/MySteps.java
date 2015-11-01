package com.web.testing.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps {

    @Given("I am a pending step")
    public void givenIAmAPendingStep() {
        System.out.println("Hola");
        // PENDING
    }

    @Given("I am still pending step")
    public void givenIAmStillPendingStep() {
        System.out.println("Hola");
        // PENDING
    }

    @When("a good soul will implement me")
    public void whenAGoodSoulWillImplementMe() {
        System.out.println("Hola");
        // PENDING
    }

    @Then("I shall be happy")
    public void thenIShallBeHappy() {
        System.out.println("Hola");
        // PENDING
    }
    
}
