package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import static junit.framework.Assert.*;

public class InformacoesUsuarioTest {
	private WebDriver navegador;
	
	@Before
	public void setUp() {
		//Abrindo o navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alessandra.nsantos\\drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Navegando para a página
		navegador.get("http://www.juliodelima.com.br/taskit"); 
	}
	
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		
		//Criar no click que possui o texto Sign in
		navegador.findElement(By.linkText("Sign in")).click();
		
		//Identificando form  do login
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));
		
		
		//Digitar Julio001 no campo com o name Login que esta dentro do form de id Signbox
		formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
		
		//Digitar  no campo com o name Passoword que esta dentro do form de id Signbox
		formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
		
		//Clicar no link com o texto "Sign in"
		navegador.findElement(By.linkText("SIGN IN")).click(); 
		
		//Validando que dentro do elemento com class "me" está o texto "Hi, hello"
		//WebElement me = navegador.findElement(By.className("me"));
		//String textoNoElementoMe = me.getText();
		//assertEquals("Hi, Julio", textoNoElementoMe);
		
		//Clicar em um link que possui a class "me"
	
		//Clicar  em um link que possui o texto "MORE DATA ABOUT YOU"
		
		//Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
		
		//Identificar a popup onde está o formulário de id addmoredata
		
		//Na combo name "type" escolhe a opção  
	}
	
	@After
	public void tearDown() {
		//Fechar o navegador
		navegador.quit();
	}
}
	