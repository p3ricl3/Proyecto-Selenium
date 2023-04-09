package definitions;

import constants.LugarEjecucion;
import constants.Navegador;
import constants.TipoEjecucion;
import driver.DriverContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;

public class CucumberHook {

    @Before
    public void beforeScanario(Scenario scenario){

        try{

            DriverContext.setUp(Navegador.Chrome, LugarEjecucion.Local, TipoEjecucion.Desktop, "Prueba");

        }catch (Exception e){
            Assert.fail("Error en la configuración del proyecto");
        }



    }

    @After
    public void after(){
        try{
            //DriverContext.quitDriver();
        }catch(Exception e){
            System.out.println(e);

        }

    }


}
