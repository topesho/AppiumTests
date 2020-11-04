package AppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class googleMapTest {
static AppiumDriver<MobileElement> driver;
//WebDriver driver;
//AndroidDriver driver;
    public static void main (String[] args) throws MalformedURLException {

        DesiredCapabilities cap  = new DesiredCapabilities();
        cap.setCapability("deviceName", "my Phone");
        cap.setCapability("udid", "4200d254ccfd15d3");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0");

        cap.setCapability("appPackage", "com.google.android.apps.maps");
        cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);


        //MobileElement search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText/android.widget.TextView"));
        //search.sendKeys("london bridge");
        MobileElement search = driver.findElement(By.className("android.widget.TextView"));
        MobileElement result =  driver.findElement(By.className("android.widget.LinearLayout"));
        search.sendKeys("london");
        //result.click();








    }
}
