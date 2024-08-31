package Elementos;

import org.openqa.selenium.By;

public class ElementosCompra {

	private By fecharpopup = By.xpath("//button[normalize-space()='Não,obrigado']");
	private By fecharspan = By.cssSelector("#fechar > span");
	private By EscolherCinema = By.xpath("//div[@id='combo_cine_div']");
	private By btnProgramacao = By.xpath("//p[@class='datas']");
	private By cinema = By
			.xpath("/html/body/section[1]/div/div/div[1]/div/div[1]/form/div/div/div/select/optgroup[7]/option");
	private By modal = By.xpath("/html/body/w-div/w-div/w-div/span");
	private By CampoDataSessao = By.cssSelector("#datepicker");
	private By btnHorasessao = By.xpath("//span[normalize-space()='21:00']");

	public By getFecharpopup() {
		return fecharpopup;
	}

	public By getFecharspan() {
		return fecharspan;
	}

	public By getBtnProgramacao() {
		return btnProgramacao;
	}

	public By getCampoDataSessao() {
		return CampoDataSessao;
	}

	public By getBtnHorasessao() {
		return btnHorasessao;
	}

	public By getEscolherCinema() {
		return EscolherCinema;
	}

	public By getCinema() {
		return cinema;
	}

	public By getModal() {
		return modal;
	}

}
