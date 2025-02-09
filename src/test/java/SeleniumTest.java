public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
       HomePageFunctions functions = new HomePageFunctions();
       functions.registerApp();
       functions.verifyNewlyCreatedUser();
       functions.closeBrowser();
    }
}