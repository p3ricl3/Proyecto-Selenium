package pages.login;

import constants.UrlAmbientes;
import driver.DriverContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;


public class LoginPagina {
    private WebDriver driver;
    Utils utils = new Utils();


    public LoginPagina(){

        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/a/img")
    private WebElement icono;

    public void LoginUpf(){

        try{
            driver.get(UrlAmbientes.LocalHost);
            utils.esperarPagina(60);
    }catch(Exception e){
            Assert.fail("No se pudo ingresar a la pagina");
    }

    }

    public void validaInformacion(){
        utils.esperaElemento(icono, 15);

    }


}
