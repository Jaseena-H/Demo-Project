package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility

{
	WebDriver driver;

	public PageUtility(WebDriver driver)

	{
		this.driver = driver;
	}

	public void selectByVisibleTextMethod(WebElement elementname, String visibletextvalue)

	{
		Select select = new Select(elementname);
		select.selectByVisibleText(visibletextvalue);

	}

	public void selectByValueMethod(WebElement elementname, String value)

	{
		Select select = new Select(elementname);
		select.selectByValue(value);

	}

	public void selectByIndexMethod(WebElement elementname, int index)

	{
		Select select = new Select(elementname);
		select.selectByIndex(index);
	}

	
	//Action Class Methods
	
	public void rightclick(WebElement elementname) {

		Actions action = new Actions(driver);
		action.contextClick(elementname).perform();
		;

	}

	public void mousehover(WebElement elementname) {

		Actions action = new Actions(driver);
		action.moveToElement(elementname).perform();

	}

	public void singleclick(WebElement elementname) {

		Actions action = new Actions(driver);
		action.click(elementname).perform();

	}

	public void doubleclick(WebElement elementname) {

		Actions action = new Actions(driver);
		action.doubleClick(elementname).perform();

	}

	public void simplealerthandling()

	{

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void confirmationalerthandling()

	{

		Alert alert = driver.switchTo().alert();
		// alert.accept();
		alert.dismiss();

	}

	public void promptalerthandling()

	{

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello Selenium");
		alert.accept();
		// alert.dismiss();

	}

}
