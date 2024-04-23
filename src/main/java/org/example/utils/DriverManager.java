package org.example.utils;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private static final ThreadLocal<ChromeDriver> driver = ThreadLocal.withInitial(ChromeDriver::new);

//    private static final ThreadLocal<ChromeDriver> driver = ThreadLocal.withInitial(() -> {
//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        return chromeDriver;
//});

//    public static ChromeDriver createDriver() {
//        driver.set(new ChromeDriver());
//        return driver.get();
//    }

    public static ChromeDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        if(getDriver() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

