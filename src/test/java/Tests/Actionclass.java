package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Actionclass {
    WebDriver driver;

    @BeforeClass

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }

    @Test
    public void dropAndDrag(){
        Actions action = new Actions(driver);

        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement seul = driver.findElement(By.id("box5"));

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        WebElement italy= driver.findElement(By.id("box106"));
        WebElement spain= driver.findElement(By.id("box107"));
        WebElement norway= driver.findElement(By.id("box101"));
        WebElement denmark= driver.findElement(By.id("box104"));
        WebElement southKorea= driver.findElement(By.id("box105"));
        WebElement sweden= driver.findElement(By.id("box102"));
        WebElement UnitedStates= driver.findElement(By.id("box103"));

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);


        action.dragAndDrop(rome,italy).build().perform();
        action.dragAndDrop(seul,southKorea).build().perform();
        action.dragAndDrop(stockholm,sweden).build().perform();
        action.dragAndDrop(oslo,norway).build().perform();
        action.dragAndDrop(madrid,spain).build().perform();
        action.dragAndDrop(copenhagen,denmark).build().perform();
        action.dragAndDrop(washington,UnitedStates).build().perform();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);



        WebElement yazi = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        Assert.assertTrue(yazi.isDisplayed());




    }

    @Test
    public void test2(){
        WebElement yazi = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        Assert.assertTrue(yazi.isDisplayed());

    }

    @Test
    public void test3(){
        WebElement yazi = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        Assert.assertTrue(yazi.isDisplayed());

    }

}
