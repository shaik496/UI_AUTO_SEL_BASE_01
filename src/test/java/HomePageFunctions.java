public class HomePageFunctions {


    SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
    PropertyReader propertyReader = new PropertyReader();


    public void registerApp() throws InterruptedException {
        System.out.println("Fill contact information");
        seleniumFunctions.launchHomepage(propertyReader.getProperty("appURL"));
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.UserName"), "Johndoe");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.LastName"), "ABRACADABRA");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.Phone"), "9239393921");
        seleniumFunctions.sendKeys(propertyReader.getProperty("ContactInformation.Email"), "abc@124");


        System.out.println("Mailing Information");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailAddress.address"), "king street");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.city"), "vuhaan");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.state"), "Koria");
        seleniumFunctions.sendKeys(propertyReader.getProperty("MailingAddress.postalCode"), "209832083");
        seleniumFunctions.selectDropDown(propertyReader.getProperty("MailingAddress.country"), "INDIA");

        System.out.println("Fill User Information");
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
            System.out.println("User created successfully");
        } else {
            System.out.println("User creation failed");
        }

    }


}
