
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestForAutomationTask {

    @Test(description = "Successful login to the page")
        public void testForAutomationTask() {

        ChromeDriver driver = new ChromeDriver();
        //Open Web-page
        driver.get("http://acodemy-app-springboot-env.eba-pagku2yg.eu-north-1.elasticbeanstalk.com/");

        WebElement addStudent = driver.findElement(By.xpath("//button[@id='addStudentButton']"));
        addStudent.click();
    }
}
