package definitions.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.login.LoginPagina;

public class LoginDef {

    LoginPagina loginUpf = new LoginPagina();


    @Given("Inicio sesion en upf")
    public void inicioSesion(){
        loginUpf.LoginUpf();
    }

    @Then("Ingreso correcto a la plataforma upf")
    public void IngresoCorrectoaLaPlataformaUpf(){
        loginUpf.validaInformacion();
    }



}
