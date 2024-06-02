import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    @Test
    public void name(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       String title= driver.getTitle();
       System.out.println(title);
    }
}
