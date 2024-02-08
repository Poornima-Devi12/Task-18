package task19;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrops {

			public static void main(String[] args)throws InterruptedException 
			{
				// Launch the Crime browser
				WebDriver driver = new ChromeDriver();

				// Load the URL using get method
				driver.get("https://jqueryui.com/droppable/");

				// Implicit wait for the element of the page 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// Maximizing the window
				driver.manage().window().maximize();

				// Switch to frame using index
				driver.switchTo().frame(0);

				// Create web elements of source and destination to perform Drag and Drop
				WebElement source = driver.findElement(By.id("draggable"));
				WebElement destination = driver.findElement(By.id("droppable"));

				// Target element text and color before drag and drop action
				String Text = destination.getText();
				String Color = destination.getCssValue("background-color");

				// Using Action class to perform Drag and Drop operation
				Actions mouse = new Actions(driver);
				mouse.dragAndDrop(source, destination).perform();

				// Thread sleep to get the aftrText and aftrColor
				Thread.sleep(2000);

				// Target element text and color after drag and drop action
				String Text1 = destination.getText();
				String Color1 = destination.getCssValue("background-color");
				String droppedtext=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();//verifying the message
				System.out.println("Source element dropped");//printing the message
		        
				//driver.close();//closing the browser

			}
		}

