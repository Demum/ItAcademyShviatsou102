package pageobject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import step.OrderStep;

public class OrderFillTest extends WebDriverSettings {

    @Test
    public void orderFillTest() {
        OrderStep orderStep2 = new OrderStep(driver);
        String name = "Peter";
        String surname = "Ivanov";

        orderStep2.fillInputSurName(surname);
        orderStep2.fillInputName(name);
        orderStep2.selectMaleGender();

        WebElement actualResultName = driver.findElement(orderStep2.getInputNameLocator());
        String actualResultNameText = actualResultName.getAttribute("value");
        Assert.assertEquals(name,actualResultNameText);

        WebElement actualResultSurName = driver.findElement(orderStep2.getInputSurNameLocator());
        String actualResultSurNameText = actualResultSurName.getAttribute("value");
        Assert.assertEquals(surname,actualResultSurNameText);

        Assert.assertTrue(driver.findElement(orderStep2.getGenderLocator()).isDisplayed());

    }

}