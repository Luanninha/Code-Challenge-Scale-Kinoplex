package Steps;

import java.io.IOException;

import Elementos.ElementosCompra;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsTelaCompra {

	Metodos m = new Metodos();
	ElementosCompra e = new ElementosCompra();

	@Given("que eu acesse a url {string}")
	public void que_eu_acesse_a_url(String string) throws InterruptedException {
		m.AbrirNavegador(string);
		m.pausa(8000);
		m.fecharOutrosPopups();
		m.pausa(26000);
		m.fecharPopupPushcrew(e.getFecharpopup());
	}

	@Given("clique e escolha o Kinoplex Amazonas")
	public void clique_e_escolha_o_kinoplex_amazonas() throws InterruptedException {
		m.pausa(6000);
		m.clicar(e.getEscolherCinema());
		m.clicar(e.getCinema());

	}

	@When("fechar a tela de popup")
	public void fechar_a_tela_de_popup() throws InterruptedException {
		m.pausa(35000);
		m.clicar(e.getModal());
	}

	@Then("escolher data e sessao e clicar em comprar")
	public void escolher_data_e_sessao_e_clicar_em_comprar() throws InterruptedException, IOException {
		m.clicar(e.getBtnProgramacao());
		m.pausa(10000);
		m.clicar(e.getBtnHorasessao());
		m.tirarPrint("Botao de compra");
		m.pausa(3000);
		m.fecharNavegador();
	}
}