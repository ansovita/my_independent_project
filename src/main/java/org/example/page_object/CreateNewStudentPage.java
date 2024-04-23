package org.example.page_object;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewStudentPage {

    @FindBy(how = How.XPATH, xpath = "//input[@id='name']")
    @Getter
    private WebElement nameField;

    @FindBy(how = How.XPATH, xpath = "//input[@pid='email']")
    @Getter
    private WebElement emailField;

    @FindBy(how = How.XPATH, xpath = "//input[@id='gender']")
    @Getter
    private WebElement genderField;

    @FindBy(how = How.XPATH, xpath = "//span[@title='OTHER']")
    @Getter
    private WebElement selectGenderField;

    @FindBy(how = How.XPATH, xpath = "////button[@type='submit']]")
    @Getter
    private WebElement submitButton;
}
