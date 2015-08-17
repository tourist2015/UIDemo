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
	 * ���������
	 */
	@Test
	public void IEBrowserTest() throws InterruptedException {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", projectpath+"/tool/IEDriverServer32.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get( "http://www.baidu.com/gaoji/preferences.html" );
		
        // ��λ�����������ʾ��Ŀ��������ѡ���
		Select select = new Select(driver.findElement(By.id("nr")));
		
		Thread. sleep(3000);
        //ѡ���3��
		select.selectByIndex(2);
				
		Thread.sleep(3000);
        // ѡ��value���Ե���20��������ֵ
		select.selectByValue("20");
				
       	Thread. sleep(3000);
        // ѡ���ı�Ϊ��ÿҳ��ʾ10������������ֵ
       	select.selectByVisibleText( "ÿҳ��ʾ10��" );

		driver.close();
	}

}
