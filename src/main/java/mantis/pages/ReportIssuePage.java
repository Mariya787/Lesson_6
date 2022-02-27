package mantis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportIssuePage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    @FindBy(css = "summary")
    private WebElement summaryInput;

    @FindBy(css = "descrition")
    private WebElement descriptionInput;

    @FindBy(xpath = "//*[@id='report_bug_form']/div/div[2]/div[2]/input")
    private WebElement submitIssueButton;


    public ReportIssuePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 50, 500);
        PageFactory.initElements(driver, this);
    }

    public void createIssue(){

    summaryInput.sendKeys("Summary");
    descriptionInput.sendKeys("Description");
    submitIssueButton.click();

    }


}
