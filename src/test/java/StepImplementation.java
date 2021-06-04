import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import static elements.HomePage.*;
import static org.junit.Assert.assertEquals;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class StepImplementation extends HookImplementation{

    @Step ("<seconds> saniye bekle")
    public void waitBySecond(int second) {
        try {
            Thread.sleep(second* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Allow Butonuna Tikla")
    public void allowButtonClick(){
        allowButton.click();
    }

    @Step("Cookie İzin Ver Butonuna tıkla")
    public void cookiesAcceptClick(){
        cookieAcceptButton.click();
    }

    @Step("Book A Flight Butonuna tıkla")
    public void bookAFlight() {
        bookAFlightButton.click();
    }

    @Step("One Way Butonuna tıkla")
    public void oneWayClick(){
        oneWayButton.click();
    }

    @Step("From tıkla")
    public void from(){
        fromToButton.click();
    }

    @Step("Send <key> to from")
    public void sendKey(String key){
        fromToSearchBox.sendKeys(key);
        fromToSelectResult.click();
    }

    @Step("To tıkla")
    public void to(){
        goToButton.click();
    }

    @Step("Send <key> to arrival")
    public void sendArrival(String key){
        goToSearchBox.sendKeys((key));
        goToSelectResult.click();
    }





}
