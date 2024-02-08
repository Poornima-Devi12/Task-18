package task18;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args)throws InterruptedException 
	{
		// Creating an object for  driver
		 WebDriver driver =new ChromeDriver();  //Launch the driver
		 driver.navigate().to("https://www.facebook.com/");     //Load the url

		 driver.manage().window().maximize();   //maximize the window
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait makes the selenium
		 String title = driver.getTitle();  //verify the the url in correct
		 System.out.println("The website has been redirected:" +title);  //print the title
		 driver.findElement(By.linkText("Create new account")).click(); //Linktext locator is used
		 driver.findElement(By.name("firstname")).sendKeys("Prabu");//identifying elements on webpage to send first name
		 driver.findElement(By.name("lastname")).sendKeys("Poornima");//identifying elements on webpage to send last name
		 driver.findElement(By.name("reg_email__")).sendKeys("poornimadevi12000@gmail.com"); //sending the email to email field
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("poornimadevi12000@gmail.com");//sending the email to email field for confrimation
		 driver.findElement(By.id("password_step_input")).sendKeys("Deviprabu@03"); //sending the password to password filed
		 WebElement day	= driver.findElement(By.id("day"));//select the values using select class 
		 Select selectday = new Select(day);
		 selectday.selectByVisibleText("3");   //using select class select day 3 by visibletext method 
		 WebElement month = driver.findElement(By.id("month"));         
		 Select selectmonth = new Select(month);
		 selectmonth.selectByValue("9");//using select class select month by value
		 WebElement year = driver.findElement(By.id("year"));
		 Select selectyear = new Select(year);
		 selectyear.selectByVisibleText("1998");//using select class select year by visibletext	 
		 Thread.sleep(2000);
		 driver.findElement(By.className("_8esa")).click();      // click the radio button
		 driver.findElement(By.name("websubmit")).click(); 
		 driver.findElement(By.linkText("No, Create New Account")).click();
		 String verify =driver.findElement(By.name("code")).getText(); //click the submit button
		 if (verify.equals("Enter the code from your email")) //comparing using if else to check whether registered or not
		 {
			System.out.println("The user is sucessfully registered");
		 } 
		 else 
		 {
			System.out.println("The user is not sucessfully registered");
		 }


	}

}
