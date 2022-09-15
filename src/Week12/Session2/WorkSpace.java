package Week12.Session2;

public class WorkSpace {

    public static void main(String[] args) {
        ChromeDriverForDesktop chromeDesktop = new ChromeDriverForDesktop();

        System.out.println("*********");
        chromeDesktop.open();
        chromeDesktop.get();
        chromeDesktop.close();

        System.out.println("*********");
        ChromeDriverForBothEnvironment chromeBoth=new ChromeDriverForBothEnvironment();

        chromeBoth.open();
        chromeBoth.get();
        chromeBoth.close();
        System.out.println("Is it Mobile "+chromeBoth.isMobile());


    }
}