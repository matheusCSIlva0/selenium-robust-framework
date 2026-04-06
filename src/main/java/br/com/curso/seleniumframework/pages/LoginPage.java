package br.com.curso.seleniumframework.pages;

import br.com.curso.seleniumframework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By campoUsuario = By.id("user-name");
    private final By campoSenha   = By.id("password");
    private final By botaoLogin   = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fazerLogin(String usuario, String senha) {
        escrever(campoUsuario, usuario);
        escrever(campoSenha, senha);
        clicar(botaoLogin);
    }
}