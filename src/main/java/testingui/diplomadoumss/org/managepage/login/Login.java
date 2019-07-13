package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import javax.xml.xpath.XPath;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordText;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitpage;

//    @FindBy(xpath="//@type='checkbox'")
//    private WebElement checkpassword;

    public void initBrowser() {
        webDriver.get(PropertyAccesor.getInstance().getURL());
    //        PageFactory.initElements(webDriver,this);

    }


    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordText.sendKeys(password);
    }

//    public void checkbox(){
//        checkpassword.click();
//    }

    public void inicializateWeb()
    {
        submitpage.click();
    }
    public  void quit2(){
        webDriver.quit();
    }

}