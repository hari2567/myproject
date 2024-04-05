import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class userregister {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulnxttrendz.ccbp.tech/login");
    WebElement usernamelink = driver.findElement(By.id("username"));
    usernamelink.sendKeys("rahul");
    WebElement passwordLink = driver.findElement(By.id("password"));
    passwordLink.sendKeys("rahul@2021");
    WebElement loginButton = driver.findElement(By.className("login-button"));
    loginButton.click();
    driver.quit();
  }
  @Test
    public void userduplicate() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91850\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulnxttrendz.ccbp.tech/login");

    WebElement usernamelink2 = driver.findElement(By.id("username"));
    usernamelink2.sendKeys("rahul");
    WebElement passwordLink2 = driver.findElement(By.id("password"));
    passwordLink2.sendKeys("rahul");
    WebElement errorMessage = driver.findElement(By.className("error-message"));
    errorMessage.sendKeys("Invalid username");
    WebElement loginButton = driver.findElement(By.className("login-button"));
    loginButton.click();
  }
  

}

