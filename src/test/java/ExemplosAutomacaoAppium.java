import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ExemplosAutomacaoAppium {
@Test
    public void primeiroExemplo() throws MalformedURLException {
//            "appium:platformName": "Android",
//            "appium:platformVersion": "13.0",
//            "appium:automationName": "UIAutomator2",
//            "appium:deviceName": "YPNR5PBYZTGUQ8X8",
//            "appium:appPackage": "io.appium.android.apis",
//            "appium:appActivity": ".ApiDemos"
    UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName("Android");
    options.setPlatformVersion("13.0");
    options.setAutomationName("UIAutomator2");
    options.setDeviceName("YPNR5PBYZTGUQ8X8");
    options.setAppPackage("io.appium.android.apis");
    options.setAppActivity(".ApiDemos");
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

    }
}
