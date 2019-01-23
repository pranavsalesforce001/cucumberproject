package nopcommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {


        @Before

        public void driversetup(){
            System.setProperty("webdriver.chrome.driver","src\\test\\Browserdriver\\chromedriver.exe");
            driver= new ChromeDriver();

            //implicity wait for driver
            driver.manage().timeouts().implicitlyWait( 20,TimeUnit.SECONDS);
            //page window
            driver.manage().window().maximize();
            //url
            driver.get("http://demo.nopcommerce,com");

        }
        @After
        public void closebrowser(){
            driver.quit();
        }
    }




