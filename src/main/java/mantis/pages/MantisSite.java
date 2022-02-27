package mantis.pages;

import org.openqa.selenium.WebDriver;

public class MantisSite {
    private final WebDriver driver;
    private LoginPage loginPage;
    private PasswordPage passwordPage;
    private MainPage mainPage;
    private ViewIssuesPage viewIssuesPage;
    private ReportIssuePage reportIssuePage;
    private FirstIssuePage firstIssuePage;

    public MantisSite(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        passwordPage = new PasswordPage(driver);
        mainPage = new MainPage(driver);
        viewIssuesPage = new ViewIssuesPage(driver);
        reportIssuePage = new ReportIssuePage(driver);
        firstIssuePage = new FirstIssuePage(driver);
    }

    public void login(String login, String password) {
        loginPage.login(login);
        passwordPage.login(password);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public PasswordPage getPasswordPage() {
        return passwordPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public ViewIssuesPage getViewIssuesPage() {
        return viewIssuesPage;
    }

    public ReportIssuePage getReportIssuePage() {
        return reportIssuePage;
    }

    public FirstIssuePage getFirstIssuePage(){
        return firstIssuePage;
    }

}
