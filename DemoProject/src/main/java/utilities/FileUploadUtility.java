package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility 


{
public void fileUploadUsingSendKeys(WebElement element,String filepath)

{
	
element.sendKeys(filepath);
}

public void fileUploadUsingRobotClass(WebElement element,String filepath) throws AWTException

{
	StringSelection obj=new StringSelection(filepath);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
    Robot obj1=new Robot();
    obj1.delay(2000);
    obj1.keyPress(KeyEvent.VK_CONTROL);
    obj1.keyPress(KeyEvent.VK_V);
    
    obj1.keyRelease(KeyEvent.VK_CONTROL);
    obj1.keyRelease(KeyEvent.VK_V);
    
    obj1.keyPress(KeyEvent.VK_ENTER);
    obj1.keyRelease(KeyEvent.VK_ENTER);


}
}
