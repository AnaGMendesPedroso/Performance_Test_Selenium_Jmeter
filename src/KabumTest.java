import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class KabumTest {

    @Test
    public void testBuscarProduto(){
        System.setProperty("webdriver.chrome.driver", "/Users/apedroso/Downloads/chromedriver_mac");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
// Para rodar no modo headless, passar como parametro a variavel options na instanciação do driver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.kabum.com.br");
        driver.findElement(By.xpath("(//input[@name='string'])[2]")).sendKeys("Alexa");
        driver.findElement((By.id("bt-busca"))).click();
        driver.quit();
    }
}
