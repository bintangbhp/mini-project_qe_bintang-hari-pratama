package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;

public class DashboardSteps {

    @Steps
    DashboardPage dashboardPage;

    @Given("I am on the dashboard page")
    public void openUrl() {
        dashboardPage.openUrl("https://mini-book-store-fe.vercel.app/");
        Assertions.assertTrue(dashboardPage.validateOnDashboardPage());
    }

    @When("I click create book page button")
    public void clickCreateBookButton() {
        dashboardPage.clickCreateBookButton();
    }

    @When("I click delete book page button")
    public void clickDeleteBookButton() {
        dashboardPage.clickDeleteBookButton();
    }

    @When("I click detail book page button")
    public void clickShowBookButton() {
        dashboardPage.clickShowBookButton();
    }

    @When("I click edit book page button")
    public void clickEditBookButton() {
        dashboardPage.clickEditBookButton();
    }

    @And("I redirect to dashboard page")
    public void validateOnDashboardPage() {
        Assertions.assertTrue(dashboardPage.validateOnDashboardPage());
    }

    @Then("I can see the book list")
    public void validateBookListTableIsDisplayed() {
        Assertions.assertTrue(dashboardPage.validateBookListTableIsDisplayed());
    }

    @Then("I can see success message on dashboard page")
    public void validateSnackBarNotifIsDisplayedOnDashboardPage() {
        Assertions.assertTrue(dashboardPage.validateSnackBarNotifIsDisplayed());
    }
}
