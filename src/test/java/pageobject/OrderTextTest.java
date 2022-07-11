package pageobject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import step.OrderStep;

public class OrderTextTest extends WebDriverSettings {
    @Test
    public void orderTextTest() {

        OrderStep orderStep = new OrderStep(driver);

        WebElement actualResultName = driver.findElement(orderStep.getNameOfLocator());
        String actualResultNameText = actualResultName.getText();
        String excpectedResultName = "Имя:";
        Assert.assertEquals(excpectedResultName, actualResultNameText);

        WebElement actualResultSurName = driver.findElement(orderStep.getSurNameLocator());
        String actualResultSurNameText = actualResultSurName.getText();
        String excpectedResultSurName = "Фамилия:";
        Assert.assertEquals(excpectedResultSurName, actualResultSurNameText);

        WebElement actualResultGender = driver.findElement(orderStep.getGenderLocator());
        String actualResultGenderText = actualResultGender.getText();
        String excpectedResultGender = "Пол:";
        Assert.assertEquals(excpectedResultGender, actualResultGenderText);

        WebElement actualResultSubmitButton = driver.findElement(orderStep.getButtonSubmitLocator());
        Boolean actualResultSubmitButtonText = actualResultSubmitButton.getAttribute("value").contains("Заказать");
        String excpectedResultSubmitButton = "Заказать";
        Assert.assertTrue(excpectedResultSubmitButton, actualResultSubmitButtonText);
    }
}

