package br.com.curso.seleniumframework.base;

import br.com.curso.seleniumframework.utils.ConfigReader;
import br.com.curso.seleniumframework.utils.ScreenshotUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        logger.info("=== INICIANDO TESTE ===");

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String url = ConfigReader.getProperty("url.base");
        driver.get(url);
        logger.info("Navegador aberto com sucesso na URL: {}", url);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = ScreenshotUtils.tirarScreenshot(driver, result.getName());
            logger.error("TESTE FALHOU! Screenshot salvo em: {}", screenshotPath);
        }

        if (driver != null) {
            driver.quit();
            logger.info("Navegador fechado com sucesso.");
        }
        logger.info("=== TESTE FINALIZADO ===");
    }
}