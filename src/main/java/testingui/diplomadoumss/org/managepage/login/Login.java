package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='email']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordText;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitpage;

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordText.sendKeys(password);
    }

    public void checkbox(){
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.xpath("//@type='checkbox'")).click();
    }

    public void inicializateWeb()
    {
        submitpage.click();
    }

}