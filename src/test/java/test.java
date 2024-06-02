package org.example;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
public class test {
    @Test
    public void name(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       String title= driver.getTitle();
       System.out.println(title);
    }
}
