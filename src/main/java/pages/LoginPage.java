package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	public void openLoginPage() {
		driver.get("https://www.bestbuy.ca/identity/en-ca/signin?tid=nSaNJLvYyxylg2ChOG6JWIol%252FTq0wWyNsm7TvS013C6nCGv%252B21%252F3ui6kspLByZxf0NLlGKSwyLtGeJRNX4Yth5y70T39GW2k6jzwPTlpipzk67F7V2e5yG31DCn4tbHoerHijQbg9O6obYpQFnzVUF09aYy1nL89PwxFxK62mIpgc9NTQj32vwVBmH4qQOLadKh6U3dC9LrLLOzseM922u27XuRec7DbQgMfAPyinoOROk3jVF2TPu1R7UzD1EdJztT6clMglT5Rj5SA%252FW%252BVZs4eflVcMfzU86%252BN1g%252Br2VfwqGLSEsUZpihksyONfaQ3");
}
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	public void closeBrowser() {
		driver.quit();
	}
	public void enterEmailandPasswword(String email, String password) {
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public void clickOnLoginPage() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='GSYpm']//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(3000);
	}
	public String readError() {
		String actualErr = driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address.')]")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
}
