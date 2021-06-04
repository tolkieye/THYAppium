import com.thoughtworks.gauge.BeforeScenario;
import elements.Elements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Selector;

public class HookImplementation extends Elements {
    //private Logger logger = (Logger) LoggerFactory.getLogger(getClass());
    protected static AppiumDriver<MobileElement> appiumDriver;
    protected static FluentWait<AppiumDriver<MobileElement>> appiumDriverFluentWait;
    protected boolean localAndroid = true;
    static AndroidDriver<MobileElement> androidDriver = null;
    protected static Selector selector;

    @BeforeScenario
    public void setup () throws MalformedURLException {
        //logger.info("Local Browser");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        //desiredCapabilities.setCapability("platformVersion", "8.1");
        desiredCapabilities.setCapability("appPackage",  "com.turkishairlines.mobile");
        desiredCapabilities.setCapability("appActivity","com.turkishairlines.mobile.ui.main.MainActivity");
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        //desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        URL remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        androidDriver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
        //URL url = new URL("http://0.0.0.0:4723/wd/hub");
        appiumDriver = new AndroidDriver(url,desiredCapabilities);
        //webDriverWait = new WebDriverWait(driver,20);
    }
}
