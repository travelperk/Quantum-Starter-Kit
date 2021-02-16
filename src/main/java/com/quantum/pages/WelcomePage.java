package com.quantum.pages;


import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.PropertyUtil;
import com.quantum.utils.ReportUtils;


public class WelcomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

    PropertyUtil props = ConfigurationManager.getBundle();

    @Override
    protected void openPage(PageLocator locator, Object... args) {
    }

    @FindBy(locator = "btn.login_mail")
    private QAFExtendedWebElement loginMailBtn;
    @FindBy(locator = "btn.sign_in")
    private QAFExtendedWebElement singInBtn;
    @FindBy(locator = "input.email")
    private QAFExtendedWebElement inputEmail;
    @FindBy(locator = "input.password")
    private QAFExtendedWebElement inputPassword;
    @FindBy(locator = "error.input.email")
    private QAFExtendedWebElement errorInputEmail;



    public void loginWithEmail() {
        loginMailBtn.click();
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void itShouldShowErrorMessage() {
        errorInputEmail.isDisplayed();
        ReportUtils.logAssert("Expected error input is displayed ", true);
    }

    public void tapLoginButton() {
        singInBtn.click();
    }
}
