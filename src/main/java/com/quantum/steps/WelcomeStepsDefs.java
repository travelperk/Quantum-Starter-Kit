package com.quantum.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.pages.WelcomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class WelcomeStepsDefs {

    WelcomePage welcomePage = new WelcomePage();

    @And("^enter email \"([^\"]*)\"$")
    public void enterEmail(String email) throws Throwable {
        welcomePage.enterEmail(email);
    }

    @And("^enter password \"([^\"]*)\"$")
    public void enterPassword(String password) throws Throwable {
        welcomePage.enterPassword(password);
    }

    @Then("^it should show error message$")
    public void itShouldShowErrorMessage() {
        welcomePage.itShouldShowErrorMessage();
    }

    @When("^users login with email$")
    public void usersLoginWithEmail() {
        welcomePage.loginWithEmail();
    }

    @And("^tap login button$")
    public void tapLoginButton() {
        welcomePage.tapLoginButton();
    }
}
