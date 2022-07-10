package pageobject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import step.OrderStep;

public class OrderTest {
    @Test
    public void openPageTest() {
        String name = "Peter";
        String surname = "Ivanov";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("c:\\src\\Zakazi.html");
        //https://github.com/Demum/ItAcademyShviatsou101/blob/d594a5a0df617b7573fe5bd06bf86f45ce418783/Zakazi.html



        OrderStep weightCalculatorStep = new OrderStep(driver);
        weightCalculatorStep.fillInputSurName(surname);
        weightCalculatorStep.fillInputName(name);
        weightCalculatorStep.selectMaleGender();

        WebElement actualResultName = driver.findElement(weightCalculatorStep.getNameOfLocator());
        String actualResultNameText = actualResultName.getText();
        String excpectedResultName = "Имя:";
        Assert.assertEquals(excpectedResultName,actualResultNameText);

        WebElement actualResultSurName = driver.findElement(weightCalculatorStep.getSurNameLocator());
        String actualResultSurNameText = actualResultSurName.getText();
        String excpectedResultSurName = "Фамилия:";
        Assert.assertEquals(excpectedResultSurName,actualResultSurNameText);

        WebElement actualResultGender = driver.findElement(weightCalculatorStep.getGenderLocator());
        String actualResultGenderText = actualResultGender.getText();
        String excpectedResultGender = "Пол:";
        Assert.assertEquals(excpectedResultGender,actualResultGenderText);

        WebElement actualResultSubmitButton = driver.findElement(weightCalculatorStep.getButtonSubmitLocator());
        String actualResultSubmitButtonText = actualResultSubmitButton.getAccessibleName();
        String excpectedResultSubmitButton = "Заказать";
        Assert.assertEquals(excpectedResultSubmitButton,actualResultSubmitButtonText);

//        WebElement actualResultInputName = driver.findElement(weightCalculatorStep.getInputNameLocator());
//        String actualResultInputNameText = actualResultInputName.;
//        String excpectedResultInputNameText = name;
//        Assert.assertEquals(excpectedResultInputNameText,actualResultInputNameText);



        driver.quit();

        

    }

    }

