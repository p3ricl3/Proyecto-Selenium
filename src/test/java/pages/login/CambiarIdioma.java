package pages.login;

import driver.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class CambiarIdioma {

    private WebDriver driver;
    Utils utils = new Utils();

    public CambiarIdioma(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);

    }

  @FindBy(xpath = "//*[@id=\"upf-dockbar\"]/div/a[1]")
  private WebElement botonCa;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/a/img")
    private WebElement icono;





    public void seleccionarIdiomaEspanol(){
        utils.esperaElemento(icono, 15);
        botonCa.click();


    }
}
