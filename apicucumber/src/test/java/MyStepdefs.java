import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepdefs {
        WebDriver driver;
    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
            driver = new FirefoxDriver();
            System.setProperty("webdriver.gecko.driver","//Users//dckap//Activities//java-workspace//lib");
            driver.get("https://www.google.com/");
            System.out.println("We are currently on the following URL:" +driver.getCurrentUrl());
            driver.get("https://www.google.com/");
    }

   /* @When("I enter <cucumber> in the search box")
    public void i_enter_cucumber_in_the_search_box() {
        driver.findElement(By.name("q")).sendKeys("cucumber");
    }*/

    @When("I see the search box")
    public void i_see_the_search_box() {
            driver.findElement(By.name("q")).isDisplayed();
            //driver.findElement(By.name("q")).click();
            System.out.println("Search");
            throw new io.cucumber.java.PendingException();
    }

}

