import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeSuite
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "/Users/marina/IdeaProjects/decWebdriverTestNG/src/test/resources/geckodriver");
    }
    @Test
    public void test001() { openBrowser();
       navigateToMainPage();
       typeQuery();
       submitSearch();
       waitForResultsPage();
       assertResultPage();

    }

    private void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
    }

    public void assertResultPage() {
        boolean isResultStatsDisplayed;
        if (By.id("resultStats").findElement(driver).isDisplayed()) {
            isResultStatsDisplayed = true;
        } else isResultStatsDisplayed = false;
        Assert.assertTrue(isResultStatsDisplayed);

    }

    private void submitSearch() {
        String selector;
        selector = ".gLFyf";
        WebElement element = By.cssSelector(selector).findElement(driver);
        element.submit();
    }

    private void typeQuery() {
        String selector;
        selector = ".gLFyf";

        WebElement element = driver.findElement(By.cssSelector(selector));
        element.sendKeys("Portnov Computer School");

    }

    private void navigateToMainPage() {
        driver.get("http://google.com");
    }

    private void openBrowser() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}


