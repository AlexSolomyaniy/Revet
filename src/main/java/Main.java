import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexs\\IdeaProjects\\Revet\\drivers" +
                "\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Test 1 Open the site
        driver.get("https://dev2.revetinc.com/");

        if (driver.getCurrentUrl().equals("https://dev2.revetinc.com/")) {
            System.out.println("Pass");
        }
            else
                System.out.println("Fail");

        //Test 2 Open Employers/Post Jobs

        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-3\"]/ul/li[1]/a")).click();
        WebElement text = driver.findElement(By.xpath("/html/body/application/ui-view/ng-component/div/div/div/div/div/div/form/h3"));
        if (text.getText().equals("Sign in to your account")) {
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");

    }
}
