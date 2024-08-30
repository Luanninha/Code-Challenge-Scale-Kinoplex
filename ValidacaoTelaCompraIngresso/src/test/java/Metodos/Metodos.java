package Metodos;

import static org.junit.Assert.assertEquals;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Metodos {
	WebDriver driver;

	// Metodo para fechar PopupPushcrew
    public void fecharPopupPushcrew(By elemento) {
        try {
            WebElement closeButton = driver.findElement(elemento);
            if (closeButton.isDisplayed()) {
             closeButton.click();
            }
        } catch (NoSuchElementException e) {
           System.out.println("Popup Pushcrew não encontrado ou já fechado.");
        }
    }

 // Metodo para fechar outros Popups
    public void fecharOutrosPopups() {
        try {
            WebElement closeButton1 = driver.findElement(By.cssSelector("#fechar > span"));
               if (closeButton1.isDisplayed()) {
                closeButton1.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Primeiro popup/modal não encontrado ou já fechado.");
        }
                try {
           
            WebElement closeButton2 = driver.findElement(By.cssSelector(".cc_b_ok"));
            closeButton2.click();
        } catch (NoSuchElementException e) {
            System.out.println("Segundo popup/modal não encontrado ou já fechado.");
        }
    }

	
	// Método para abrir e maximizar navegador
	public void AbrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Método para clicar
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Método para selecionar dia
	public void selecionarDia(String dia) {
		List<WebElement> dias = driver.findElements(By.cssSelector(".react-datepicker__day"));
		for (WebElement e : dias) {
			if (e.getText().equals(dia)) {
				e.click();
				return;
			}
		}
		throw new NoSuchElementException("Dia " + dia + " não encontrado no calendário.");
	}

	// Método para preencher
	public void preencher(By elemento, String nome) {
		driver.findElement(elemento).sendKeys(nome);
	}

	// Método para selecionar um valor em um dropdown
	public void selecionar(By elemento, String valor) {
		Select dropdown = new Select(driver.findElement(elemento));
		dropdown.selectByVisibleText(valor);
	}

	// Método para pausar
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	// Método para fechar navegador
	public void fecharNavegador() {
		driver.quit();
	}

	// Método para validar texto
	public void validarTexto(By elemento, String textoEsperado) {
		String mensagemCapturada = driver.findElement(elemento).getText().trim();
		mensagemCapturada = mensagemCapturada.replaceAll("\\s+", " ");
		textoEsperado = textoEsperado.trim().replaceAll("\\s+", " ");
		System.out.println("Texto Capturado: [" + mensagemCapturada + "]");
		assertEquals(textoEsperado, mensagemCapturada);
	}

	// Método para tirar print
	public void tirarPrint(String nome) throws IOException {
		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File Desfile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, Desfile);
	}

	// Método para forçar clique com javascript
	public void clicarElementoComJavaScript(By elemento) {
		rolarAteElemento(elemento);
		WebElement webElement = driver.findElement(elemento);
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
	}



	// Método para rolar a página até um elemento
	public void rolarAteElemento(By elemento) {
		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(elemento));
	}



	// Método para alternar para uma nova janela
	public void mudarParaNovaJanela() {
		String janelaAtual = driver.getWindowHandle();
		for (String janela : driver.getWindowHandles()) {
			if (!janela.equals(janelaAtual)) {
				driver.switchTo().window(janela);
				break;
			}
		}
	}


}
