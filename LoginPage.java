package  src.com.test

public class LoginPage  extends testClass {
	


		public static void signIn(){
			ReusableMethods.clickobj(" .//*[@id='gb_70']", "signIn is clicked");
			ReusableMethods.entertext(".//*[@id='Email']", "ABC@gmail.com", "email enterred");
			ReusableMethods.clickobj(".//*[@id='next']", "click on the next button");
			ReusableMethods.entertext(".//*[@id='Passwd']", "ram123", "you entered the password");
			ReusableMethods.clickobj(".//*[@id='signIn']", "click on sign in");
		}
		public static void errormsg(){
			ReusableMethods.clickobj(".//*[@id='gb_70']", "signIn is clicked");
			ReusableMethods.entertext(".//*[@id='Email']", "ABC@gmail.com", "email enterred");
			ReusableMethods.clickobj(".//*[@id='next']", "click on the next button");
			ReusableMethods.entertext(".//*[@id='Passwd']", "ram55n", "you entered the password");
			ReusableMethods.clickobj(".//*[@id='signIn']", "click on sign in");
		}
		public static void checkbox(){
			ReusableMethods.clickobj(".//*[@id='gb_70']", "signIn is clicked");
			ReusableMethods.entertext(".//*[@id='Email']", "ABC@gmail.com", "email enterred");
			ReusableMethods.clickobj(".//*[@id='next']", "click on the next button");
			ReusableMethods.entertext(".//*[@id='Passwd']", "ram", "you entered the password");
			ReusableMethods.checkbox(".//*[@id='PersistentCookie']", "remember checkbox is clicked");
			ReusableMethods.clickobj(".//*[@id='signIn']", "click on sign in");
			//	return new  HomePage(driver);

		}
	}



