package  src.com.test;
import org.openqa.selenium.By;
public class ReusableMethods extends testClass{

	// In This class I have created some reusable methods which we can use it in our all the 
          //methods in our pages we can make more based on the resuability of code

	public static void clickobj(String Xpath ,String objName){ 
		if(driver.findElement(By.xpath(Xpath)).isDisplayed()){
			driver.findElement(By.xpath(Xpath)).click();
			System.out.println(objName);
		}else{
			System.out.println("element is not present");
		}
	}
	public  static void entertext(String Xpath,String textvalue,String objName ){
		if(driver.findElement(By.xpath(Xpath)).isDisplayed()){
			driver.findElement(By.xpath(Xpath)).sendKeys(textvalue);
			System.out.println( objName);
		}else
			System.out.println("id filed is not available");
	}
	public static void checkbox(String Xpath,String objName){
		if(driver.findElement(By.xpath(Xpath)).isSelected()){
			System.out.println("is selected");
		}else{
			driver.findElement(By.xpath(Xpath)).click();
		}

	}
}


