package driver;

import constants.LugarEjecucion;
import constants.Navegador;
import constants.TipoEjecucion;
import org.openqa.selenium.WebDriver;

public class DriverContext {

    private static DriverManager driverManager = new DriverManager();

    public DriverContext(){

    }

    public static void setUp(Navegador nav, LugarEjecucion lugar, TipoEjecucion tipo, String nombreRelease){
        driverManager.resolvDriver(nav, lugar, tipo, nombreRelease);

    }

    public static WebDriver getDriver() {return driverManager.getDriver();}

    public static void quitDriver() {driverManager.getDriver().quit();}

    public static Boolean  isRemote() {return driverManager.isRemote();}

}
