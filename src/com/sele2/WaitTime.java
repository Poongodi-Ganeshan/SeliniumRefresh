package com.sele2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds (30));
		d.manage().window().maximize();
		d.findElement (By.id ("txt_unam")).sendKeys("sylix");
		d.findElement (By.id("txt_pass")).sendKeys("admin");
		Thread.sleep(5000);
		d.findElement(By.name("Button3")).click();
		Thread.sleep(5000);
		d.close();
				


	}

}

