package br.com.curso.seleniumframework.pages;

import br.com.curso.seleniumframework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By precoTotal = By.cssSelector(".cart-total");
    private final By botaoFinalizarCompra = By.cssSelector(".checkout-button");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String obterValorTotal() {
        return obterTexto(precoTotal);
    }

    public void finalizarCompra() {
        clicar(botaoFinalizarCompra);
    }
}