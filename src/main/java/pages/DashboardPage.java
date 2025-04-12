package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends PageBase{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    By dashboardText = By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");



    private String dashboardExpectedResult = "Dashboard";

    public String getDashboardExpectedResult() {
        return dashboardExpectedResult;
    }

    public String dashboardTextActualResult(){
        return getElementText(dashboardText);
    }
}
