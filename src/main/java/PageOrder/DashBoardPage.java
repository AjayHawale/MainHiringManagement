package PageOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashBoardPage  {

	/* panelist */
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement selectPanelistdd;
	@FindBy(xpath = "//div[@title='Prathibha']")
	WebElement selectPanelist;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement selectAllProfilesdd;
	@FindBy(xpath = "//div[@title='Manual testing'] ")
	WebElement selectAllProfiles;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range ant-picker-large']")
	WebElement selectDateRange;
	@FindBy(xpath = "//td[@title='2022-07-01']")
	WebElement startDate;
	@FindBy(xpath = "//td[@title='2022-07-10']")
	WebElement endDate;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-text'])[1]")
	WebElement targetOption;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-text'])[2]")
	WebElement scheduleOption;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-text'])[3]")
	WebElement conductedOption;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-text'])[4]")
	WebElement cancelledOption;
	
	/* Jobs profile */
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[1]")
	WebElement JobsProfilePage;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement selectJobprofilesdd;
	@FindBy(xpath = "//div[@title='Manual testing']")
	WebElement selectJobprofile;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range ant-picker-large']")
	WebElement selectJPDateRange;
	@FindBy(xpath = "//td[@title='2022-07-01']")
	WebElement startJPdate;
	@FindBy(xpath = "//td[@title='2022-07-12']")
	WebElement endJPdate;
	
	
	/* Recruiters */
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[2]")
	WebElement RecruitersPage;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement recruitersdd;
	@FindBy(xpath = "//div[@title='Placement technologies']")
	WebElement selectRecruiter;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement selectProfilesdd;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range ant-picker-large']")
	WebElement selectRDateRange;
	@FindBy(xpath = "//td[@title='2022-07-01']")
	WebElement startRdate;
	@FindBy(xpath = "//td[@title='2022-07-10']")
	WebElement endRdate;
	
	/* Hr Round page */
	@FindBy(xpath = "(//div[@class='ant-tabs-tab'])[3]")
	WebElement HrRoundsPage;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement selectHrRounddd;
	@FindBy(xpath = "//div[@title='Python Developer']")
	WebElement selectHrRound;
	@FindBy(xpath = "//div[@class='ant-picker ant-picker-range ant-picker-large']")
	WebElement selectHrDateRange;
	@FindBy(xpath = "//td[@title='2022-07-01']")
	WebElement startHrDate;
	@FindBy(xpath = "//td[@title='2022-07-10']")
	WebElement endHrDate;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-text']")
	WebElement candidateName;
	@FindBy(xpath = "(//div[@class='ant-picker ant-picker-large'])[1]")
	WebElement shortlistedDate;
	@FindBy(xpath = "(//div[@class='ant-picker ant-picker-large'])[2]")
	WebElement OfferReleasedDate;
	@FindBy(xpath = "//td[@title='2022-07-05']")
	WebElement ORDate;
	@FindBy(xpath = "(//div[@class='ant-picker ant-picker-large'])[3]")
	WebElement DojDate;
	@FindBy(xpath = "//div[@class='ant-picker-footer']")
	WebElement DDate;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[4]")
	WebElement offerStatus;
	@FindBy(xpath = "//div[@title='Offer Accepted']")
	WebElement selectOfferStatus;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg']")
	WebElement updateButton;
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PanelistPage() throws InterruptedException
	{
		Thread.sleep(2000);
		selectPanelistdd.click();
		Thread.sleep(2000);
		selectPanelist.click();
		Thread.sleep(2000);
		selectAllProfilesdd.click();
		Thread.sleep(2000);
		selectAllProfiles.click();
		Thread.sleep(2000);
		selectDateRange.click();
		startDate.click();
		Thread.sleep(1000);
		endDate.click();
		Thread.sleep(4000);
	}
	
	public void JobsTitlePage() throws InterruptedException
	{
		Thread.sleep(2000);
		JobsProfilePage.click();
		Thread.sleep(4000);
		selectJobprofilesdd.click();
		Thread.sleep(2000);
		selectJobprofile.click();
		Thread.sleep(2000);
		selectJPDateRange.click();
		Thread.sleep(2000);
		startJPdate.click();
		Thread.sleep(2000);
		endJPdate.click();
		Thread.sleep(4000);
	}
	
	public void RecruitersPage() throws InterruptedException
	{
		Thread.sleep(2000);
		RecruitersPage.click();
		Thread.sleep(3000);
		recruitersdd.click();
		Thread.sleep(2000);
		selectRecruiter.click();
		Thread.sleep(2000);
		selectProfilesdd.click();
		Thread.sleep(2000);
		selectProfilesdd.click();
		Thread.sleep(2000);
		selectRDateRange.click();
		Thread.sleep(3000);
		startRdate.click();
		Thread.sleep(2000);
		endRdate.click();
		Thread.sleep(4000);
	}
	
	public void HrProcessPage() throws InterruptedException
	{
		Thread.sleep(2000);
		HrRoundsPage.click();
		Thread.sleep(3000);
		selectHrRounddd.click();
		Thread.sleep(2000);
		selectHrRound.click();
		Thread.sleep(2000);
		selectHrDateRange.click();
		Thread.sleep(2000);
		startHrDate.click();
		Thread.sleep(2000);
		endHrDate.click();
		Thread.sleep(4000);	
	}
	
	public void editStatus() throws InterruptedException 
	{
		Thread.sleep(2000);
		JobsProfilePage.click();
		Thread.sleep(2000);
		HrRoundsPage.click();
		Thread.sleep(3000);
		selectHrRounddd.click();
		Thread.sleep(2000);
		selectHrRound.click();
		Thread.sleep(2000);
		selectHrDateRange.click();
		Thread.sleep(2000);
		startHrDate.click();
		Thread.sleep(2000);
		endHrDate.click();
		Thread.sleep(4000);	
		candidateName.click();
		Thread.sleep(3000);
//		OfferReleasedDate.click();
//		Thread.sleep(2000);
//		ORDate.click();
		Thread.sleep(2000);
		DojDate.click();
		Thread.sleep(2000);
		DDate.click();
		Thread.sleep(2000);
		offerStatus.click();
		Thread.sleep(2000);
		selectOfferStatus.click();
		Thread.sleep(2000);
		updateButton.click();
		Thread.sleep(4000);
	}
}
