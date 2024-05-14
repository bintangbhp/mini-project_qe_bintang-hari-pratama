package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;

import starter.pages.DeleteBookPage;

public class DeleteBookSteps {

    @Steps
    DeleteBookPage deleteBookPage;

    @And("I am on the delete book page")
    public void validateOnDeleteBookPage() {
        Assertions.assertTrue(deleteBookPage.validateOnDeleteBookPage());
    }

    @And("I click delete book button")
    public void clickdeleteBookButton() {
        deleteBookPage.clickdeleteBookButton();
    }
}
