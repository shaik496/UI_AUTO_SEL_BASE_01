import org.apache.logging.log4j.Logger;

public class HomePageFunctions {

    Logger log = AppLoggingUtil.getLogger(HomePageFunctions.class);
    SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
    PropertyReader propertyReader = new PropertyReader();


    public void registerApp() throws InterruptedException {
        log.info("Fill contact information");
        seleniumFunctions.launchHomepage(propertyReader.getProperty("appURL"));
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.UserName"), "Johndoe");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.LastName"), "ABRACADABRA");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.Phone"), "9239393921");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.Email"), "abc@124");


        log.info("Mailing Information");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailAddress.address"), "king street");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.city"), "vuhaan");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.state"), "Koria");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.postalCode"), "209832083");
        seleniumFunctions.selectDropDown(propertyReader.getProperty("MailingAddress.country"), "INDIA");

        log.info("Fill User Information");
        seleniumFunctions.sendKeys(propertyReader.getProperty("UserInformation.userName"), "Johndoe");
        seleniumFunctions.sendKeys(propertyReader.getProperty("UserInformation.password"), "password");
        seleniumFunctions.sendKeys(propertyReader.getProperty("UserInformation.confirmPassword"), "password");
        seleniumFunctions.ClickOnElement(propertyReader.getProperty("UserInformation.submitButton"));
    }

    public void closeBrowser() {
        seleniumFunctions.closeBrowser();

    }


    public void verifyNewlyCreatedUser() {
        String userTitle = seleniumFunctions.getElementText(propertyReader.getProperty("UserInformation.userTitle"));
        if (userTitle.equals("Note: Your user name is Johndoe.")) {
            log.info("User created successfully");
        } else {
            log.info("User creation failed");
        }

    }


    public void loginToApp() {


    }


}
