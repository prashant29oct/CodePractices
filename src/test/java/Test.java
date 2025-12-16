import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Test {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=169BF359C9628DA1BBF7D7155B99D970");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test11");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test11");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //String errorResponse = driver.findElement(By.xpath("//p[@class='error']")).getText();
        WebElement element = driver.findElement(By.xpath("//h1[@class='title']"));
        String loginResponse = driver.findElement(By.xpath("//h1[@class='title']")).getText();

        //Assert.assertNotEquals("LoginToApplication",errorResponse);

        //Assert.assertEquals(loginResponse, "Welcome");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(loginResponse.contains("Welcome"));

    }
}
