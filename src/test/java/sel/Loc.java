package sel;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loc {
	
	public  static void main(String[] args) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/Armani-Exchange-Analog-Black-Watch-AX1343/dp/B0846PJPW9/ref=lp_75450487031_1_1?pf_rd_p=9e034799-55e2-4ab2-b0d0-eb42f95b2d05&pf_rd_r=BJ3CHQ1JTPG575CJVC1E");
	WebElement t=	driver.findElement(By.xpath("//span[contains(text(),' Armani Exchange Analog Black Dial ')][1]/../../../../..//span[@class='a-price-whole'][1]"));
		System.out.println(t.getText());
	driver.close();
		
		
		//hi
		
		
		
		
		
		
		
		
		
		
		}
}   
