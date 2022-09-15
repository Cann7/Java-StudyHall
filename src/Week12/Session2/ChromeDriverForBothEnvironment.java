package Week12.Session2;

public class ChromeDriverForBothEnvironment implements WebDriver,MobileDriver{


    @Override
    public void open() {
        System.out.println("Chrome Driver for Desktop is ready");
    }

    @Override
    public void get() {
        System.out.println("Chrome driver goes to amazon.com");
    }

    @Override
    public void close() {
        System.out.println("Chrome driver for desktop is closing");
    }

    @Override
    public boolean isMobile() {
        return true;
    }
}

