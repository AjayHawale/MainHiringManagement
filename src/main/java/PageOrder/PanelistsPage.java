package PageOrder;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PanelistsPage {
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Panelist Name']")
	WebElement PanelistNameField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[1]")
	WebElement EmailField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[2]")
	WebElement ContactField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[3]")
	WebElement AvailableSlots;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[4]")
	WebElement InterviewsperdayField;
	@FindBy(xpath = "(//th[@class='ant-table-cell'])[5]")
	WebElement ManageField;

	/* to search a panelist */
	@FindBy(xpath = "//input[@placeholder='Search Panelist']")
	WebElement searchPanelistField;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-input-search-button']")
	WebElement searchPanelistButton;
	/* Ajay */
	/* to add a panelist */
	@FindBy(xpath = "//*[@id='root']/section/section/section/aside/div/ul/li[7]")
	WebElement PanelistModule;
	@FindBy(xpath = "(//span[text()='Add Panelist'])[1]")
	WebElement AddpanelistButton;
	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	WebElement panelistName;
	@FindBy(xpath = "(//input[@placeholder='Email'])[1]")
	WebElement panelistEmail;
	@FindBy(xpath = "(//input[@placeholder='Phone'])[1]")
	WebElement panelistPhone;
	@FindBy(xpath = "(//input[@id='rc_select_4'])[1]") // Associate Software Engineer
	WebElement DesignationDropdown;
	@FindBy(xpath = "(//button[@id='addPanelist'])[1]")
	WebElement savePanelistButton;

	/* to edit a panelist */

	@FindBy(xpath = "(//button[@id='edit4'])[1]")
	WebElement EditPanelistPencil;

	@FindBy(xpath = "(//input[@placeholder='Search Panelist'])[1]")
	WebElement SearchPanelistField;
	@FindBy(xpath = "//span[@class='anticon anticon-search']")
	WebElement QSearchBtn;

	@FindBy(xpath = "(//span[@class='anticon anticon-user-switch'])[2]")
	WebElement InterviewsPerDayIcon;
	@FindBy(xpath = "(//input[@class='ant-input text-center'])[4]")
	WebElement WedField;
	@FindBy(xpath = "(//button[@id='saveSlots'])[2]")
	WebElement SaveButton;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement ZainNamePanelist;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	WebElement ZainEmailPanelist;
	@FindBy(xpath = "//tbody/tr[1]/td[3]")
	WebElement ZainContactPanelist;

	/* Ajay Available slot */

	@FindBy(xpath = "//button[@id='slotButton4-3']")
	WebElement AvailableSlot;
	@FindBy(xpath = "//button[@id='slotButton3']")
	WebElement WedDay;
	@FindBy(xpath = "(//input[@placeholder='Start time'])[1]")
	WebElement StartTimeField;
	@FindBy(xpath = "//div[text()='02']")
	WebElement Twoclock;
	@FindBy(xpath = "//div[text()='00']")
	WebElement ZeroMinutes;

	@FindBy(xpath = "//div[text()='PM']")
	WebElement PmOption;
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement OkBtn;
	@FindBy(xpath = "(//input[@placeholder='End time'])[1]")
	WebElement EndTimeField;
	@FindBy(xpath = "//div[text()='03']")
	WebElement ThreeClock;
	@FindBy(xpath = "//div[text()='30']")
	WebElement ThirtyMin;
	@FindBy(xpath = "//div[text()='PM']")
	WebElement EndPmOption;
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement OkOptionBtn;
	@FindBy(xpath = "(//button[@id='saveSlots'])[1]")
	WebElement SaveBtn;

	/* to view panelist details */
	@FindBy(xpath = "(//td[@class='ant-table-cell'])[13]")
	WebElement viewPanelist;
	@FindBy(xpath = "//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement closeViewPanelistButton;

	/* to edit a panelist */
	@FindBy(xpath = "//button[@id='edit8']")
	WebElement editPanelistOption;
	@FindBy(xpath = "//div[@title='Associate Software Engineer']")
	WebElement editPanelistDesignation;

	/* to delete a panelist */
	@FindBy(xpath = "//a[text()='steffi']")
	WebElement deletePanelistOption;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	WebElement deletePanelistButton;

	public PanelistsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initiaLIZATION
	}

	public void AddPanelist(String PanelistName, String PanelistEmail, String PanelistPhone, String PanelistDesignation)
			throws InterruptedException {
		//wait(3000);
		PanelistModule.click();
		wait(3000);
		AddpanelistButton.click();
		wait(3000);
		panelistName.sendKeys(PanelistName);
		panelistEmail.sendKeys(PanelistEmail);
		panelistPhone.sendKeys(PanelistPhone);
		wait(3000);
		DesignationDropdown.sendKeys(PanelistDesignation);
		wait(3000);
		savePanelistButton.click();
	}

	public void EditPanelist(String EditPanelistPhone) throws InterruptedException {
		wait(3000);
		EditPanelistPencil.click();
		wait(2000);
		panelistPhone.clear();
		wait(1000);
		panelistPhone.sendKeys(EditPanelistPhone);
		String strphone = panelistPhone.getText();
		System.out.println("Edited Mobile numer is -" + strphone);
	}

	public void SearchPanel(String PanelistSearch) throws InterruptedException {
		SearchPanelistField.clear();
		Thread.sleep(5000);
		SearchPanelistField.sendKeys(PanelistSearch);
		QSearchBtn.click();
		wait(3000);
		String act = ZainNamePanelist.getText();
		System.out.println("The Name of panelist is--" + act);
		String expect = "Zain";
//assert.assertEquals(act, expected);
		String act1 = ZainEmailPanelist.getText();
		System.out.println("The Email of panelist is--" + act1);
		String act2 = ZainContactPanelist.getText();
		System.out.println("The contact of panelist is--" + act2);

	}

	public void CheckPanelistInterview() throws InterruptedException {
		wait(2000);
		InterviewsPerDayIcon.click();
		wait(2000);
		WedField.clear();
		WedField.sendKeys("2");
		String TotalInterviews = WedField.getText();
		System.out.println("Total Interviews for Wed is " + "" + TotalInterviews);
		SaveButton.click();
	}

	public void AvailableSlot() {

	}

	public void deletePanelist() throws InterruptedException {
		Thread.sleep(2000);
		deletePanelistOption.click();
		Thread.sleep(2000);
		deletePanelistButton.click();
		Thread.sleep(2000);
	}

	public void ViewPanelist() throws InterruptedException {
		Thread.sleep(8000);
		searchPanelistField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		searchPanelistField.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		searchPanelistButton.click();
		Thread.sleep(4000);
		viewPanelist.click();
		Thread.sleep(4000);
		closeViewPanelistButton.click();
		Thread.sleep(2000);
	}

	public boolean validatePanelistNameField() {
		return PanelistNameField.isDisplayed();
	}

	public boolean validatePanelistEmailField() {
		return EmailField.isDisplayed();
	}

	public boolean validatePanelistContactField() {
		return ContactField.isDisplayed();
	}

	public boolean validatePanelistSlotsField() {
		return AvailableSlots.isDisplayed();
	}

	public boolean validateInterviewsPerDayField() {
		return InterviewsperdayField.isDisplayed();
	}

	public boolean validatePanelistManageField() {
		return ManageField.isDisplayed();
	}

	public String validatePanelistPage() {
		return driver.getTitle();
	}
}
