package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_page;

public class Pom1 extends Base_page{
@FindBy(name="email")
private WebElement Untbox;
@FindBy(name="pass")

private WebElement Pwdtbox;
@FindBy(name="login")
private WebElement lgnbtn;

public Pom1(WebDriver driver)
{
	super(driver);
}
public void undata(String un)
{
	Untbox.sendKeys(un);
}
public void pwddata(String pw)
{
	Pwdtbox.sendKeys(pw);
}
public void clicklogin()
{
	lgnbtn.click();
}

}
