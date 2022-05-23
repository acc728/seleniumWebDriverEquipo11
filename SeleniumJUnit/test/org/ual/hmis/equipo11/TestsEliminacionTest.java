// Generated by Selenium IDE
package org.ual.hmis.equipo11;
import org.junit.Test;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestsEliminacionTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  private int browser= 0;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  switch (browser) {
	    case 0:  // firefox
	    	// Firefox
	    	// Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
	    	// Descomprimir el archivo geckodriver.exe en la carpeta drivers
	    	
	    	System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe"); //HAY QUE COMENTAR ESTO EN JENKINS
	    	driver = new FirefoxDriver();
	    	break;
	    case 1: // chrome
	    	// Chrome
	    	// Descargar Chromedriver de https://chromedriver.chromium.org/downloads
	    	// Descomprimir el archivo chromedriver.exe en la carpeta drivers

	    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //HAY QUE COMENTAR ESTO EN JENKINS
	    	driver = new ChromeDriver();
	    	break;

	    default:
	    	fail("Please select a browser");
	    	break;
	    }

	//Chrome
//    driver = new ChromeDriver();
//    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.setHeadless(true);
//    driver = new ChromeDriver(chromeOptions);
    
    //Firefox
//    driver = new FirefoxDriver();
//    FirefoxOptions firefoxOptions = new FirefoxOptions();
//    firefoxOptions.setHeadless(true);
//    driver = new FirefoxDriver(firefoxOptions);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void aCreacionDeTareaCasoCorrecto() {
    // Test name: CreacionDeTarea(CasoCorrecto)
    // Step # | name | target | value
    // 1 | open | http://coresqlfernandezcamacho.azurewebsites.net/ | 
    driver.get("http://coresqlfernandezcamacho.azurewebsites.net/");
    // 2 | setWindowSize | 887x661 | 
    driver.manage().window().setSize(new Dimension(887, 661));
    // 3 | click | linkText=Create New | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.linkText("Create New")).click();
    // 4 | click | id=Description | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("Description")).click();
    // 5 | type | id=Description | Tarea1
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.id("Description")).sendKeys("Tarea1");
    // 6 | type | id=CreatedDate | 2022-05-26
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    if(browser == 0)
    	driver.findElement(By.id("CreatedDate")).sendKeys("2022-05-26");
    else
    	driver.findElement(By.id("CreatedDate")).sendKeys("26/05/2022");
 
    // 7 | click | css=.btn | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".btn")).click();
  }
  
  @Test
  public void modificacionDeTareaCasoBackToList() {
    // Test name: ModificacionDeTarea(CasoBackToList)
    // Step # | name | target | value
    // 1 | open | http://coresqlfernandezcamacho.azurewebsites.net/ | 
    driver.get("http://coresqlfernandezcamacho.azurewebsites.net/");
    // 2 | setWindowSize | 887x570 | 
    driver.manage().window().setSize(new Dimension(887, 570));
    // 3 | storeText | css=tr:nth-child(1) > td:nth-child(1) | Nombre
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    vars.put("Nombre", driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).getText());
    // 4 | storeText | css=tr:nth-child(1) > td:nth-child(2) | Fecha
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    vars.put("Fecha", driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).getText());
    // 5 | click | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[2]/a[normalize-space(text()) = 'Edit'] | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[2]/a[normalize-space(text()) = \'Edit\']")).click();
    // 6 | click | linkText=Back to List | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.linkText("Back to List")).click();
    // 7 | assertText | css=tr:nth-child(1) > td:nth-child(1) | ${Nombre}
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).getText(), is(vars.get("Nombre").toString()));
    // 8 | assertText | css=tr:nth-child(1) > td:nth-child(2) | ${Fecha}
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).getText(), is(vars.get("Fecha").toString()));
  }
  
  @Test
  public void zEliminacionDeTareaCasoBackToList() {
    // Test name: EliminacionDeTarea(CasoBackToList)
    // Step # | name | target | value
	  // 1 | open | http://coresqlfernandezcamacho.azurewebsites.net/ | 
	    driver.get("http://coresqlfernandezcamacho.azurewebsites.net/");
	    // 2 | setWindowSize | 887x570 | 
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    driver.manage().window().setSize(new Dimension(887, 570));
	    // 3 | click | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[2]/a[normalize-space(text()) = 'Delete'] | 
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[2]/a[normalize-space(text()) = \'Delete\']")).click();
	    // 4 | click | linkText=Back to List | 
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    driver.findElement(By.linkText("Back to List")).click();
	    // 5 | assertText | //td[normalize-space(text()) = 'Tarea1'] | Tarea1
	    try {
	        Thread.sleep(1000);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    assertThat(driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']")).getText(), is("Tarea1"));
	  
  }
  
  @Test
  public void modificacionDeTareaCasoCorrecto() {
    // Test name: ModificacionDeTarea(CasoCorrecto)
    // Step # | name | target | value
    // 1 | open | http://coresqlfernandezcamacho.azurewebsites.net/ | 
    driver.get("http://coresqlfernandezcamacho.azurewebsites.net/");
    // 2 | setWindowSize | 887x661 | 
    driver.manage().window().setSize(new Dimension(887, 661));
    // 3 | storeText | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[1] | Fecha
//    vars.put("Fecha", driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[1]")).getText());
    // 4 | click | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[2]/a[normalize-space(text()) = 'Edit'] | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[2]/a[normalize-space(text()) = \'Edit\']")).click();
    // 6 | type | id=CreatedDate | 2022-04-15
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    
    if(browser == 0)
    	driver.findElement(By.id("CreatedDate")).sendKeys("2022-04-15");
    else
    	driver.findElement(By.id("CreatedDate")).sendKeys("15/04/2022");
    // 7 | click | css=.btn | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".btn")).click();
    // 8 | assertNotText | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[1] | ${Fecha}
//    assertThat(driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[1]")).getText(), is(not(vars.get("Fecha").toString())));
    // 9 | assertText | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[1] | 2022-04-15
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    assertThat(driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[1]")).getText(), is("2022-04-15"));
  }
  
  @Test
  public void zEliminacionDeTareaCasoCorrecto() {
    // Test name: EliminacionDeTarea(CasoCorrecto)
    // Step # | name | target | value
    // 1 | open | http://coresqlfernandezcamacho.azurewebsites.net/ | 
    driver.get("http://coresqlfernandezcamacho.azurewebsites.net/");
    // 2 | setWindowSize | 887x570 | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.manage().window().setSize(new Dimension(887, 570));
    // 3 | click | //td[normalize-space(text()) = 'Tarea1']/following-sibling::*[2]/a[normalize-space(text()) = 'Delete'] | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.xpath("//td[normalize-space(text()) = \'Tarea1\']/following-sibling::*[2]/a[normalize-space(text()) = \'Delete\']")).click();
    // 4 | click | css=.btn | 
    try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    driver.findElement(By.cssSelector(".btn")).click();
  }
}
