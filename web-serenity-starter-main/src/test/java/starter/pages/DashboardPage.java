package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    private By title(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/h1");
    }

    private By createButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/a");
    }

    private By showBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[1]/td[5]/div/a[1]");
    }

    private By editBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[last()]/td[5]/div/a[2]");
    }

    private By deleteBookButton(){
        return By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[1]/td[5]/div/a[3]");
    }

    private By bookListTable(){
        return By.xpath("//*[@id=\"root\"]/div/table");
    }

    private By snackBarNotif(){
        return By.id("notistack-snackbar");
    }

    @Step
    public boolean validateOnDashboardPage() {
        return $(title()).getText().equals("Books List");
    }

    @Step
    public void clickCreateBookButton() {
        $(createButton()).click();
    }

    @Step
    public void clickShowBookButton() {
        $(showBookButton()).click();
    }

    @Step
    public void clickEditBookButton() {
        $(editBookButton()).click();
    }

    @Step
    public void clickDeleteBookButton() {
        $(deleteBookButton()).click();
    }

    @Step
    public boolean validateBookListTableIsDisplayed() {
        return $(bookListTable()).isDisplayed();
    }

    @Step
    public boolean validateSnackBarNotifIsDisplayed() {
        return $(snackBarNotif()).isDisplayed();
    }
}
