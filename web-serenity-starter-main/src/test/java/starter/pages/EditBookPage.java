package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditBookPage extends PageObject {
    private By title(){
        return By.xpath("//*[@id=\"root\"]/div/h1");
    }

    private By titleAfteEdit(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/span[2]");
    }

    private By authorAfteEdit(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/span[2]");
    }

    private By publishYearAfteEdit(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/span[2]");
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

    private By editBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By snackBarNotif(){
        return By.id("notistack-snackbar");
    }

    @Step
    public boolean validateOnEditBookPage() {
        return $(title()).getText().equals("Edit Book");
    }

    @Step
    public boolean validateAfterEdit(String title, String author, String publishYear) {
        return $(titleAfteEdit()).getText().equals(title) && $(authorAfteEdit()).getText().equals(author) && $(publishYearAfteEdit()).getText().equals(publishYear);
    }

    @Step
    public void clickEditBookButton() {
        $(editBookButton()).click();
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
