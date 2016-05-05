package  src.com.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testClass {
	static WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public void openbrowserTest(){
		driver=new FirefoxDriver();
	}

	
	@DataProvider(name ="pages")
	public Object[][] pages(){
		return new Object[][]{
				{"Enter Test data here"},
				{"Enter Test data here"},
				{"Enter Test data here"}
		};
	}

@Test(groups={"p1","loginTest"}, dataProvider="pages", enabled=false)
	public void openTest(String url){
		driver.get(url);
	}


	@Test(groups={"p1","loginTest"})
	public  void loginTest(){
		driver.get("Website Link");
		LoginPage.checkbox();
		String actual=driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")).getText();
		Assert.assertEquals("Expected data", actual);
		System.out.println("it matches");
	}
	@Test(groups={"p2","loginTest"})
	public void errerMsg(){
		driver.get("Website Link");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.errormsg();
		String Actual=driver.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']")).getText();
		Assert.assertEquals(Actual, "The email and password you entered don't match.");
		System.out.println("it matches");
	}
	@Test(groups={"p2","errerMsg"})
	public void  checkboxClicked(){
		driver.get("Website Link");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage.checkbox();
	}/*
		@Test(enabled=false)
		public void openNewWindow2() throws InterruptedException {
		driver.get(""Website Link"");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			HomePage.openNewWindow();
		    }*/
	@AfterMethod(alwaysRun=true)
	public void closeBowser(){
		driver.close();
	}
}



