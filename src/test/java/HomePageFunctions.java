public class HomePageFunctions {

    public void LoginToApp() throws InterruptedException {
        PropertyReader propertyReader = new PropertyReader();
        SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
        seleniumFunctions.launchHomepage(propertyReader.getProperty("appURL"));
        seleniumFunctions.ClickOnElement(propertyReader.getProperty("LoginMenu"));
        seleniumFunctions.sendKeys(propertyReader.getProperty("UserName"), propertyReader.getProperty("UsernameValue"));
        seleniumFunctions.ClickOnElement(propertyReader.getProperty("ContinueButton"));
        seleniumFunctions.sendKeys(propertyReader.getProperty("Password"), propertyReader.getProperty("PasswordValue"));
        seleniumFunctions.ClickOnElement(propertyReader.getProperty("LoginButton"));
    }

}
