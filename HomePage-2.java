package  src.com.test;


public class HomePage extends testClass {

      public static void openNewWindow()throws InterruptedException  {
		ReusableMethods.clickobj(".//*[@id='gb_70']", "signIn is clicked");
		ReusableMethods.entertext(".//*[@id='Email']", "ABC@gmail.com", "email enterred");
		ReusableMethods.clickobj(".//*[@id='next']", "click on the next button");
		ReusableMethods.entertext(".//*[@id='Passwd']", "ram123", "you entered the password");
		ReusableMethods.clickobj(".//*[@id='signIn']", "click on sign in");
	    ReusableMethods.clickobj(".//*[@id='gbw']/div/div/div[1]/div[2]/a", "clicked on gmail");
	    System.out.println("bhbkjnknk");
	    ReusableMethods.clickobj(".//*[@id=':j1']/div","clicked on inbox arraow buttom ");
	  }  
      
      
    //  You can make more methods here according to the functionality 
}
