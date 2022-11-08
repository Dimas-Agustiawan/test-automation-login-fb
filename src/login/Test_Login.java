package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Firefox\\chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();  
		
		 // Launch Website  
        driver.navigate().to("http://www.facebook.com/");
        Actions aksi = new Actions(driver);
        
        // Masukkan Email
        WebElement textemail = driver.findElement(By.name("email"));
        Action tulisEmail = aksi.sendKeys(textemail, "dimasagustiawan30@gmail.com").build();
        tulisEmail.perform();
        
        // Masukkan Password
        WebElement textpassword = driver.findElement(By.name("pass"));
        Action tulisPass = aksi.sendKeys(textpassword, "Dsq4tpw14").build();
        tulisPass.perform();
        
        // Klik Button Login
        WebElement btn = driver.findElement(By.name("login"));
        Action klikBtn = aksi.click(btn).build();
        klikBtn.perform();
	}

}
