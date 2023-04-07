package driver;

import constants.LugarEjecucion;
import constants.Navegador;
import constants.TipoEjecucion;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class DriverManager {

    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private RemoteWebDriver driverRemote;
    private WebDriver driverLocal;
    private boolean remoto;
    public static String valorTipoEjecucion;

    protected void resolvDriver(Navegador nav, LugarEjecucion lugar, TipoEjecucion tipo, String buildName) {

        try {

            valorTipoEjecucion = String.valueOf(tipo);

            switch (tipo) {
                case Desktop:
                    switch (lugar) {
                        case Local:
                            remoto = false;
                            switch (nav) {
                                case Chrome:
                                    System.out.println("\nEjecucion con Chrome!\n ");
                                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Webdiver/chrome/chromedriver");
                                    ChromeOptions chromeOptions = new ChromeOptions();
                                    chromeOptions.addArguments("--ignore-certificate-errors");
                                    driverLocal = new ChromeDriver(chromeOptions);
                                    break;

                                case Firefox:
                                    System.out.println("\n Ejecucion con Firefox");
                                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Webdiver/Firefox/geckodriver");
                                    driverLocal = new FirefoxDriver();
                                    break;

                                case Safari:
                                    System.out.println("\n Ejecucion con Safari");
                                    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "true");
                                    driverLocal = new SafariDriver(capabilities);
                                    break;

                                default:
                                    Assert.fail("El navegador seleccionado no existe");

                            }
                            driverLocal.manage().window().maximize();

                    }

            }

        } catch (Exception e) {
            Assert.fail("Se ha generado un error en el driver:" + e);

        }

    }

    protected WebDriver getDriver() {
        if (remoto) {
            return driverRemote;
        } else {
            return driverLocal;
        }

    }

    protected Boolean isRemote() {
        if (remoto) {
            return true;
        } else {
            return false;
        }

    }
}
