package br.com.curso.seleniumframework.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EcommerceUtils {

    private final WebDriver driver;
    private final WaitUtils wait;
    private static final Logger logger = LogManager.getLogger(EcommerceUtils.class);

    public EcommerceUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public void adicionarAoCarrinho(By locator) {
        wait.elementToBeClickable(locator).click();
        logger.info("Produto adicionado ao carrinho");
    }

    public void irParaCarrinho(By locator) {
        wait.elementToBeClickable(locator).click();
        logger.info("Navegando para o carrinho");
    }

    public String obterPrecoAtual(By locator) {
        String preco = wait.visibilityOfElementLocated(locator).getText();
        logger.info("Preço atual obtido: {}", preco);
        return preco;
    }

    public void aplicarCupom(String cupom) {
        logger.info("Aplicando cupom: {}", cupom);
        // Adapte os locators para o seu e-commerce
    }
}