package com.sele2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webconversion {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();
	d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	WebElement user = d.findElement(By.xpath("//input[@id='txt_unam']"));
	user.sendKeys("sylix");
	WebElement pass = d.findElement(By.xpath("//input[@id='txt_pass']"));
	pass.sendKeys("admin");
	Thread.sleep(5000);
	WebElement login = d.findElement(By.name("Button3"));
	login.click();
			
	
	}
	

}
