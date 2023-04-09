package definitions.cambiarIdioma;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login.CambiarIdioma;

public class CambiarIdiomaDef {

    CambiarIdioma idioma = new CambiarIdioma();

    @Given("me encuentro en el home de upf")
    public void meEncuentroEnElHomeDeUpf(){

    }

    @When("Presiono el boton \"Ca\"")
    public void presionoElBotonCa(){

        idioma.seleccionarIdiomaEspanol();

    }

    @Then("Valido que se cambie el idioma a espanol")
    public void validoQueSeCambieElIdiomaAEspanol(){


    }

}
