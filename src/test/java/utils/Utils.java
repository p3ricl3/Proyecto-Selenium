package utils;

import driver.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {
    private WebDriver driver;

    public Utils(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);

    }

    public void esperarPagina(int segundos){
        DriverContext.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(segundos));
    }

    public void esperaElemento(WebElement elemento, int segundos){

        try{
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(segundos));
            wait.until(ExpectedConditions.visibilityOf(elemento));
        }catch(Exception e){
            Assert.fail("No se encontró el elemento" +elemento + "en el tiempo configurado");
    }
    }

}
