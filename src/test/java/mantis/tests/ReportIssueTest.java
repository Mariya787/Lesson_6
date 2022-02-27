package mantis.tests;

import mantis.pages.MantisSite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReportIssueTest extends BaseTest {

    private MantisSite mantisSite;

    @Test
    public void createAndDeleteIssue() {

        mantisSite = new MantisSite(driver);
        mantisSite.login("admin", "admin20");

        mantisSite.getMainPage().goToReportIssuePage();
        mantisSite.getReportIssuePage().createIssue();

    }
}
