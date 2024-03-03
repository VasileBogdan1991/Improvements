package test.java.DriverManager;

public class DriverManager {
    public static WebDriver driver;
    static {

        Runtime.getRuntime().addShutdownHook(new Thread() {

            public void run() { driver.quit(); }

        });

    }
    public WebDriver getDriver(){

        if (driver == null){

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();

            return driver;

        }else {

            return driver;

        }

    }
}
