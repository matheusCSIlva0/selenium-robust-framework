package br.com.curso.seleniumframework.base;

import br.com.curso.seleniumframework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    protected WaitUtils wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
        PageFactory.initElements(driver, this);  // Inicializa @FindBy automaticamente
    }

    // Métodos comuns em qualquer e-commerce
    protected void clicar(By locator) {
        wait.elementToBeClickable(locator).click();
    }

    protected void escrever(By locator, String texto) {
        WebElement element = wait.visibilityOfElementLocated(locator);
        element.clear();
        element.sendKeys(texto);
    }

    protected String obterTexto(By locator) {
        return wait.visibilityOfElementLocated(locator).getText();
    }

    protected boolean elementoExiste(By locator) {
        return !driver.findElements(locator).isEmpty();
    }
}