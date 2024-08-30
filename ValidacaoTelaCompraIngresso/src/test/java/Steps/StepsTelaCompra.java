package Steps;

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
	    m.pausa(6000);
	    m.fecharPopupPushcrew(e.getFecharpopup());
	    m.clicar(e.getBtnCookie());
	}

	@Given("clique em cinema e escolha o Kinoplex Amazonas")
	public void clique_em_cinema_e_escolha_o_kinoplex_amazonas() throws InterruptedException {
		m.pausa(6000);
		
		}

	@When("clicar em programação e fechar a tela de popup")
	public void clicar_em_programação_e_fechar_a_tela_de_popup() {
		m.clicar(e.getBtnProgramacao());
	}

	@When("escolher data, sessao e clicar em comprar")
	public void escolher_data_sessao_e_clicar_em_comprar() {
		m.preencher(e.getCampoDataSessao(), "30082024");
		m.clicar(e.getBtnHorasessao());

	}

	@When("devera aparecer a tela para escolher o assento")
	public void devera_aparecer_a_tela_para_escolher_o_assento() {
		m.clicar(e.getBtnAssento());
	}

	@When("na tela escolher o tipo de ingresso")
	public void na_tela_escolher_o_tipo_de_ingresso() {
		m.clicar(e.getBtnIngressoInteira());
	}

	@Then("segue tela pipoca e pular")
	public void segue_tela_pipoca_e_pular() {
		m.clicar(e.getBtnIrPipoca());
		m.clicar(e.getBtnPular());
	}

	@Then("aparece a tela para preencher o cpf")
	public void aparece_a_tela_para_preencher_o_cpf() {
		m.preencher(e.getCampoEmailouCpf(), "32803698862");
        m.fecharNavegador();
	}

}
