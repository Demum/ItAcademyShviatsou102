package pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public  class WebDriverSettings {
    public WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("c:\\src\\Zakazi.html");
        //https://github.com/Demum/ItAcademyShviatsou101/blob/d594a5a0df617b7573fe5bd06bf86f45ce418783/Zakazi.html

    }
    @After
    public void close() {
            driver.quit();
    }

}