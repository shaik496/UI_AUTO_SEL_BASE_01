public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        new HomePageFunctions().LoginToApp();
        new SeleniumFunctions().closeBrowser();
    }
}