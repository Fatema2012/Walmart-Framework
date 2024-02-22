package comon;

import java.awt.print.PrinterException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ComonActions {
	
public  static void clickElement(WebElement element) {
element.click();	
try {
	
} catch (NoSuchElementException|NullPointerException e) {
	System.out.println("Exception is:" + e);
}
}

public static void pause(long sec) {
	try {
	Thread.sleep(sec * 1000);	
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
