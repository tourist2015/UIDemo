package practice;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
	
	/**
	 * 下拉框操作
	 */
	@Test
	public void IEBrowserTest() throws InterruptedException {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer32.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get( "http://www.baidu.com/gaoji/preferences.html" );
		
        // 定位到搜索结果显示条目数的下拉选项框
		Select select = new Select(driver.findElement(By.id("nr")));
		
		Thread. sleep(3000);
        //选择第3条
		select.selectByIndex(2);
				
		Thread.sleep(3000);
        // 选择value属性等于20的下拉框值
		select.selectByValue("20");
				
       	Thread. sleep(3000);
        // 选择文本为“每页显示10条”的下拉框值
       	select.selectByVisibleText( "每页显示10条" );

		driver.close();
	}

}
