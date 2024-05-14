package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShowBookPage extends PageObject {
    private By title(){
        return By.xpath("//*[@id=\"root\"]/div/h1");
    }

    private By detailBook(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]");
    }

    private By snackBarNotif(){
        return By.id("notistack-snackbar");
    }

    @Step
    public boolean validateOnShowBookPage() {
        return $(title()).getText().equals("Show Book");
    }

    @Step
    public boolean validateDetailBookIsDisplayed() {
        return $(detailBook()).isDisplayed();
    }

    @Step
    public boolean validateSnackBarNotifIsDisplayed() {
        return $(snackBarNotif()).isDisplayed();
    }
}
