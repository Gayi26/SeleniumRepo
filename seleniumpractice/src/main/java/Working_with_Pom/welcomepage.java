package Working_with_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {
	public welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(linkText="Register")
		private WebElement registerLink;
		@FindBy(xpath="//input[@id=\"vote-poll-1\"]")
		private WebElement voteButton;

		public WebElement getRegisterLink() {
			return registerLink;
		}

		public WebElement getVoteButton() {
			return voteButton;
		}

		public void setVoteButton(WebElement voteButton) {
			this.voteButton = voteButton;
		}
	

}
