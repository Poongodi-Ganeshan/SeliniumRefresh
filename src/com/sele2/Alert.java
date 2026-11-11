package com.sele2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	d.get("http://brm.tremplintech.in/web_pages/login.aspx");
	d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
	d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admi");
	Thread.sleep(5000);
	d.findElement(By.cssSelector("#Button3")).click();
	Thread.sleep(5000);
	d.switchTo().alert().accept();
	
	
	}

}
