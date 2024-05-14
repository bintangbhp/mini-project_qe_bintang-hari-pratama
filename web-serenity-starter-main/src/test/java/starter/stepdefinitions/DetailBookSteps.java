package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

import starter.pages.ShowBookPage;

public class DetailBookSteps {
    @Steps
    ShowBookPage showBookPage;

    @Then("I am on the show book page")
    public void validateOnShowBookPage() {
        Assertions.assertTrue(showBookPage.validateOnShowBookPage());
    }

    @And("I can see the book's detail")
    public void validateDetailBookIsDisplayed() {
        Assertions.assertTrue(showBookPage.validateDetailBookIsDisplayed());
    }

    @Then("I can see success message on show book page")
    public void validateSnackBarNotifIsDisplayedOnDashboardPage() {
        Assertions.assertTrue(showBookPage.validateSnackBarNotifIsDisplayed());
    }
}
