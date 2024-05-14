package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeleteBookPage extends PageObject {
    private By title(){
        return By.xpath("//*[@id=\"root\"]/div/h1");
    }

    private By deleteBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By snackBarNotif(){
        return By.id("notistack-snackbar");
    }

    @Step
    public boolean validateOnDeleteBookPage() {
        return $(title()).getText().equals("Delete Book");
    }

    @Step
    public void clickdeleteBookButton() {
        $(deleteBookButton()).click();
    }

    @Step
    public boolean validateSnackBarNotifIsDisplayed() {
        return $(snackBarNotif()).isDisplayed();
    }
}
