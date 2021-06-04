package elements;

import io.appium.java_client.MobileElement;

public class HomePage extends Elements{

    public static MobileElement allowButton = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");

    public static MobileElement cookieAcceptButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frPrivacy_btnAccept");

    public static MobileElement bookAFlightButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");

    public static MobileElement oneWayButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");

    public static MobileElement fromToButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");

    public static MobileElement fromToSearchBox = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");

    public static MobileElement fromToSelectResult= (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");

    public static MobileElement goToButton = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");

    public static MobileElement goToSearchBox = (MobileElement) driver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");

    public static MobileElement goToSelectResult = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");

    public HomePage() {

    }
    /*
    static {
        bookAFlight = (MobileElement) driver.findElementById()
    }
    */


}
