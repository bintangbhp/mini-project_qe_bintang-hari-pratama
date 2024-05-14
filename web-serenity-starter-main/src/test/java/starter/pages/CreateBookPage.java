package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateBookPage extends PageObject {
    private By title(){
        return By.xpath("//*[@id=\"root\"]/div/h1");
    }

    private By titleInputField(){
        return By.xpath("//*[@id=\"title\"]");
    }

    private By authorInputField(){
        return By.xpath("//*[@id=\"author\"]");
    }

    private By publishYearInputField(){
        return By.xpath("//*[@id=\"publishYear\"]");
    }

    private By saveBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By snackBarNotif(){
        return By.id("notistack-snackbar");
    }

    @Step
    public boolean validateOnCreateBookPage() {
        return $(title()).getText().equals("Create Book");
    }

    @Step
    public void clickSaveBookButton() {
        $(saveBookButton()).click();
    }

    @Step
    public boolean validateSnackBarNotifIsDisplayed() {
        return $(snackBarNotif()).isDisplayed();
    }

    @Step
    public void inputTitle(String title) {
        $(titleInputField()).type(title);
    }

    @Step
    public void inputAuthor(String author) {
        $(authorInputField()).type(author);
    }

    @Step
    public void inputPublishYear(String publishYear) {
        $(publishYearInputField()).type(publishYear);
    }
}
