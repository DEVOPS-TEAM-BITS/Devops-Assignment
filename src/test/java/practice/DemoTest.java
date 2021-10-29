package practice;

//import org.junit.Test;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import sun.plugin.dom.core.Document;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
//import org.springframework.boot.test.context.SpringBootTest;

public class DemoTest {

    public void OpenTestBrowserConnection(){
        System.setProperty("webdriver.chrome.driver","/Users/I524946/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21%2Fy5bz5vSiBaH2osVmgLIgDLSo0a4zB2DTkY0tybDHwTVQCQWaVbw1PK0wEY24KhGEOnkWbuCSmyhiy8%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=off");
        System.out.println("Navigation to Application Successful !");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();

    }
    public void TestNavToManageDepartmentsAndEmployees(){
        System.setProperty("webdriver.chrome.driver","/Users/I524946/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21%2Fy5bz5vSiBaH2osVmgLIgDLSo0a4zB2DTkY0tybDHwTVQCQWaVbw1PK0wEY24KhGEOnkWbuCSmyhiy8%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=off");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions ac = new Actions(driver);
        WebElement tile = driver.findElement(By.id("__tile1-__xmlview0--container-0"));
        ac.click(tile).perform();
        System.out.println("Manage Employees Tile Clicked");
        driver.navigate().to("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21QT4Zj84ZXfmKbGbRSVmlxiGrEWsOcxXVgZ47XDPpmqmPVp%2FxmX1duApXkJMO%2BhNvuXkq82fOLGYxO4o%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=off#/User");
        if(driver.findElement(By.id("__title0")).isEnabled()){
            System.out.println("Header title of new page is :" +" " +driver.findElement(By.id("__title0")).getAccessibleName());
            driver.navigate().to("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21%2Fy5bz5vSiBaH2osVmgLIgDLSo0a4zB2DTkY0tybDHwTVQCQWaVbw1PK0wEY24KhGEOnkWbuCSmyhiy8%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=on");
        }
        else{
            System.out.println("Navigation to Manage Employees page Automation failed !");
        }
        tile = driver.findElement(By.id("__tile1-__xmlview0--container-1"));
        ac.click(tile).perform();
        System.out.println("Manage Departments Tile Clicked");
        driver.navigate().to("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21%2Fy5bz5vSiBaH2osVmgLIgDLSo0a4zB2DTkY0tybDHwTVQCQWaVbw1PK0wEY24KhGEOnkWbuCSmyhiy8%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=off#/Department");
        if(driver.findElement(By.id("__title0")).isEnabled()){
          System.out.println("Header title of new page is :" +" " +driver.findElement(By.id("__title0")).getAccessibleName());
            driver.navigate().to("https://webidetesting5940575-e47oapir9t.dispatcher.int.sap.eu2.hana.ondemand.com/webapp/index.html?hc_orionpath=%2FDI_webide_di_workspace1fs7uqu2e8v3s1ks%2Fdevops-UI&neo-di-affinity=BIGipServerdisapwebide.int.sap.eu2.hana.ondemand.com+%21%2Fy5bz5vSiBaH2osVmgLIgDLSo0a4zB2DTkY0tybDHwTVQCQWaVbw1PK0wEY24KhGEOnkWbuCSmyhiy8%3D&origional-url=index.html&sap-ui-appCacheBuster=..%2F&sap-ui-xx-componentPreload=on");
            driver.quit();
        }
        else{
            System.out.println("Navigation to Manage Department page Automation failed !");
        }

    }
    public static void main(String args[]){
        DemoTest obj = new DemoTest();
        obj.OpenTestBrowserConnection();
        obj.TestNavToManageDepartmentsAndEmployees();
    }
}
