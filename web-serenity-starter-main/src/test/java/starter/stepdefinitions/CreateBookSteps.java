package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

import starter.pages.CreateBookPage;

public class CreateBookSteps {
    @Steps
    CreateBookPage createBookPage;

    @And("I am on the create book page")
    public void validateOnCreateBookPage() {
        Assertions.assertTrue(createBookPage.validateOnCreateBookPage());
    }

    @And("I input valid title on create book page")
    public void inputValidTitle() {
        createBookPage.inputTitle("Norwegian Wood");
    }

    @And("I input valid author on create book page")
    public void inputValidAuthor() {
        createBookPage.inputAuthor("Haruki Murakami");
    }

    @And("I input valid publish year on create book page")
    public void inputValidPublishYear() {
        createBookPage.inputPublishYear("1987");
    }

    @And("I input invalid title on create book page")
    public void inputInvalidTitle() {
        createBookPage.inputTitle("");
    }

    @And("I input invalid author on create book page")
    public void inputInvalidAuthor() {
        createBookPage.inputAuthor("");
    }

    @And("I input invalid publish year on create book page")
    public void inputInvalidPublishYear() {
        createBookPage.inputPublishYear("");
    }

    @And("I click save book button")
    public void clickSaveBookButton() {
        createBookPage.clickSaveBookButton();
    }

    @Then("I can see error message on create book page")
    public void validateSnackBarNotifIsDisplayedOnCreateBookPage() {
        Assertions.assertTrue(createBookPage.validateSnackBarNotifIsDisplayed());
    }
    
}
