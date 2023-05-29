package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(className="atLogoImg")
	private WebElement logo;
	
	@FindBy(id="username")
	private WebElement usernameTF;
	
	@FindBy(name="pwd")
	private WebElement pwdTF;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement KeepMeLoggedInCB;
	
	@FindBy(partialLinkText="Forgot")
	private WebElement forgotPwdLink;
	
	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid')]")
	private WebElement errorMsg;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getLogo() {
		return logo;
		
	}
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	public void setPassword(String password) {
		pwdTF.sendKeys(password);
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void clickLogin() {
		loginButton.click();
		
	}
	public void clickKeepMeLoggedIn() {
		KeepMeLoggedInCB.click();
	}
	public void clickForgetPwdLink() {
		forgotPwdLink.click();
		
	}
	public String getErrorMsg() {
		return errorMsg.getText();
	}
	
}
