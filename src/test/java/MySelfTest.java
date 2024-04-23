import org.example.page_object.CreateNewStudentPage;
//import org.example.utils.DriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.utils.DriverManager.*;

public class MySelfTest {

    WebDriverWait waiter;
    CreateNewStudentPage createNewStudentPage = new CreateNewStudentPage();

    @BeforeMethod
    public void beforeTest() {
        waiter = new WebDriverWait(getDriver(), Duration.ofSeconds(6));

        getDriver().get("http://acodemy-app-springboot-env.eba-pagku2yg.eu-north-1.elasticbeanstalk.com/");
    }

    @Test
    public void successfulLoginTest() {
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("addStudentButton")));
        getDriver().findElement(By.id("addStudentButton")).click();

        createNewStudentPage.getNameField().sendKeys("TA");
        createNewStudentPage.getEmailField().sendKeys("email@inbox.lv");
        createNewStudentPage.getGenderField().sendKeys("select_gender");
        createNewStudentPage.getSelectGenderField().sendKeys("OTHER");
        createNewStudentPage.getSubmitButton().click();

    }

//          @AfterMethod
//        public void afterTest() {
//            closeDriver();
//        }
}


