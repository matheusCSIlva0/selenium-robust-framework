package br.com.curso.seleniumframework.tests;

import br.com.curso.seleniumframework.base.BaseTest;
import br.com.curso.seleniumframework.pages.CartPage;
import br.com.curso.seleniumframework.pages.LoginPage;
import br.com.curso.seleniumframework.utils.EcommerceUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Fluxo de Compra - Demo")
public class CompraSimplesTest extends BaseTest {

    @Test(description = "Login → Adicionar produto → Carrinho → Validar preço")
    @Description("Teste completo usando o framework robusto")
    public void testeFluxoCompraDemo() {
        LoginPage loginPage = new LoginPage(driver);
        EcommerceUtils ecommerceUtils = new EcommerceUtils(driver);
        CartPage cartPage = new CartPage(driver);

        // 1. Login
        loginPage.fazerLogin("standard_user", "secret_sauce");

        // 2. Adicionar produto ao carrinho
        ecommerceUtils.adicionarAoCarrinho(By.id("add-to-cart-sauce-labs-backpack"));

        // 3. Ir para o carrinho
        ecommerceUtils.irParaCarrinho(By.className("shopping_cart_link"));

        // 4. Validar preço total
        String total = cartPage.obterValorTotal();
        Assert.assertTrue(total.contains("$"), "Preço não encontrado!");

        logger.info("Teste finalizado com sucesso! Valor total: {}", total);
    }
}