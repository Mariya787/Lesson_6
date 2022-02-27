package mantis.tests;

import mantis.pages.MantisSite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ReportIssueTest extends BaseTest {

    private MantisSite mantisSite;

    @Test
    public void createAndDeleteIssue() {

        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuePage();
        mantisSite.getReportIssuePage().createIssue();
        mantisSite.getMainPage().goToViewIssuesPage();
        Assertions.assertEquals("Summary", mantisSite.getViewIssuesPage().getIssueName());

        mantisSite.getViewIssuesPage().goToFirstIssuePage();
        Assertions.assertTrue(mantisSite.getFirstIssuePage().getFirstIssueName().contains("Summary"));

        mantisSite.getFirstIssuePage().deleteIssue();
        driver.findElement(By.cssSelector("#action-group-div [value='Delete Issues'] ")).click();
        Assertions.assertNotEquals("Summary", mantisSite.getViewIssuesPage().getIssueName());

    }
}
