package step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderStep {
    WebDriver driver;
    By surNameLocator = By.xpath("//td[contains(text(),'Фамилия')]");
    By inputSurNameLocator = By.xpath("//input[@surname='surname']");
    By NameLocator = By.xpath("//td[contains(text(),'Имя')]");
    By inputNameLocator = By.xpath("//input[@name='name']");
    By genderLocator = By.xpath("//td[contains(text(),'Пол')]");
    By inputGenderLocator = By.xpath("//input[@value='m']");
    By buttonSubmitLocator = By.xpath("//input[@type='submit'][@value='Заказать']");


    public OrderStep(WebDriver driver){
        this.driver=driver;
    }

    public By getSurNameLocator() {
        return surNameLocator;
    }




    public By getInputSurNameLocator(){
        return inputSurNameLocator;
    }


    public By getNameOfLocator() {
        return NameLocator;
    }

    public By getInputNameLocator(){
        return inputNameLocator;
    }

    public By getGenderLocator() {
        return genderLocator;
    }

    public By getButtonSubmitLocator() {
        return buttonSubmitLocator;
    }

    public void fillInputSurName(String surname){
    WebElement inputSurName = driver.findElement(inputSurNameLocator);
    inputSurName.sendKeys(surname);
        }



        public void fillInputName (String name ){
            WebElement inputName = driver.findElement(inputNameLocator);
            inputName.sendKeys(name);
        }
    public void selectMaleGender() {
        WebElement inputGender = driver.findElement(inputGenderLocator);
        inputGender.click();
    }


    public void clickButtonSubmit() {
        WebElement buttonSubmit = driver.findElement(buttonSubmitLocator);
        buttonSubmit.click();
    }

}
