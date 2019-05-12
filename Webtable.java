import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\SelniumContains\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement we=driver.findElement(By.xpath("//table"));
		List<WebElement> rows =we.findElements(By.xpath(".//thead/tr"));
		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
		 WebElement row=it.next();
		 List <WebElement> cells=row.findElements(By.xpath(".//th"));
		 Iterator<WebElement> it1=cells.iterator();
		  while(it1.hasNext())
		  {
			  String st=it1.next().getText();
			  System.out.println(st);
		  }
		}
		
		rows =we.findElements(By.xpath(".//tbody/tr"));
		it=rows.iterator();
		while(it.hasNext()) {
		 WebElement row=it.next();
		 String st=row.findElement(By.xpath(".//th")).getText();
		 System.out.println(st);
		 List <WebElement> cells=row.findElements(By.xpath(".//td"));
		 Iterator<WebElement> it1=cells.iterator();
		  while(it1.hasNext())
		  {
			  st=it1.next().getText();
			  System.out.println(st);
		  }
		}
	}

}
