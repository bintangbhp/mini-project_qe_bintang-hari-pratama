package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

import starter.pages.EditBookPage;

public class EditBookSteps {
    @Steps
    EditBookPage editBookPage;

    @And("I am on the edit book page")
    public void validateOnCreateBookPage() {
        Assertions.assertTrue(editBookPage.validateOnEditBookPage());
    }

    @And("I input valid title on update page")
    public void inputValidTitle() {
        editBookPage.inputTitle("Sapiens");
    }

    @And("I input valid author on update page")
    public void inputValidAuthor() {
        editBookPage.inputAuthor("Yuval Noah Harari");
    }

    @And("I input valid publish year on update page")
    public void inputValidPublishYear() {
        editBookPage.inputPublishYear("2011");
    }

    @And("I input invalid title on update page")
    public void inputInvalidTitle() {
        editBookPage.inputTitle("");
    }

    @And("I input invalid author on update page")
    public void inputInvalidAuthor() {
        editBookPage.inputAuthor("");
    }

    @And("I input invalid publish year on update page")
    public void inputInvalidPublishYear() {
        editBookPage.inputPublishYear("");
    }

    @And("I click edit book button")
    public void clickEditBookButton() {
        editBookPage.clickEditBookButton();
    }

    @Then("I redirect to show book page after edit book")
    public void validateAfterEdit() {
        Assertions.assertTrue(editBookPage.validateAfterEdit("Sapiens", "Yuval Noah Harari", "2011"));
    }

    @Then("I can see error message on update page")
    public void validateSnackBarNotifIsDisplayedOnCreateBookPage() {
        Assertions.assertTrue(editBookPage.validateSnackBarNotifIsDisplayed());
    }
}
