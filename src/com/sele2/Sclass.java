package com.sele2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sclass {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver = new ChromeDriver();
		String UploadURL = "https://demo.guru99.com/test/upload/";
		driver.get(UploadURL);
        WebElement fu = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		fu.sendKeys("C:\\Users\\DELL\\Desktop\\1-cover-letter-sample.docx ");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='terms']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#submitbutton")).click();
		Thread.sleep(5000);
		driver.close();
        
	}

}
