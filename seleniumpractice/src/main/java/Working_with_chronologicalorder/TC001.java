package Working_with_chronologicalorder;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001 extends baseclass{
	@Test
	public void addproduct()
	{
		driver.findElement(By.xpath("//input[@class=\"button-2 product-box-add-to-cart-button\"]")).click();
		Reporter.log("product added to cart successfuly",true);
	}

}
