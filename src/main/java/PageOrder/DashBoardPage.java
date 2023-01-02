package PageOrder;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
	WebDriver driver;
	@FindBy(xpath="//div[@class='ant-picker-body'])[2]/table/tbody/tr[3]/td[1]")
	WebElement Calender;
//div[@class='ant-picker-body'])[2]/table/tbody/tr[3]/td[1]
	@FindBy(xpath="(//div[@class='ant-row'])[4]")
	WebElement panelistOverviewAll;
	
	
	
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
	@FindBy(xpath = "(//*[@class='ant-select-selection-search-input'])[3]")
	WebElement selectJobprofiles;
	
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

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initiaLIZATION
	}

	public void PanelistPage() throws InterruptedException {
		Thread.sleep(2000);
		//going to dashboard module
		driver.findElement(By.xpath("//*[@id='root']/section/section/section/aside/div/ul/li[1]")).click();

	}

	public void HrProcessPage() throws InterruptedException {
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

	public void SelectPanelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-select-selector']")));
		driver.findElement(By.xpath("//div[@class='ant-select-selector']")).click();
		System.out.println("The clicked panelists names....");
		int size = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']")).size();
		System.out.println("The size is :" + size);
		for (int i = 0; i < size; i++) {
			String Panelists = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']")).get(i)
					.getText();
			System.out.println("The Panelists are :" + Panelists);

		}
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[2]")).click();
	}
	public void SelectCalenderPanelist() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ant-picker-body'])[2]/table/tbody/tr[3]/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='End date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ant-picker-body'])[2]/table/tbody/tr[3]/td[7]")).click();
	}
	
	public void PanelistOverview() {
		boolean p=	panelistOverviewAll.isDisplayed();
		System.out.println("panelist Overview All  Data is displayed."+ p);
		
	}
	public void JobProfileData() throws InterruptedException {
		JobsProfilePage.click();
		Thread.sleep(2000);
		System.out.println("It is getting into Job Profile");
		
	}
	
	public void SelectJobProfile() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-select-selection-search-input'])[3]")));
		driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[17]")).click();
	}
	
	public void SelectCalenderJobProfile1() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Start date'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='16'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='24'])[4]")).click();
		Thread.sleep(3000);
		System.out.println(" Job profile data is showning");
		
	}
	
	public void recruitersData() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='ant-tabs-tab'])[2]")).click();
		Thread.sleep(2000);
		System.out.println("It is getting into Recruiters page");
		
	}
	
	public void SelectRecruiters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]")));
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[4]")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//div[@class='ant-select-item-option-content'])[23]")).click();
	}
	public void SelectCalenderRecruiters() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@placeholder='Start date'])[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='20'])[6]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='27'])[6]")).click();
		Thread.sleep(4000);
		System.out.println(" Recruiters data is showning");
		
	}
	
	public void HRroundData() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='ant-tabs-tab'])[3]")).click();
		Thread.sleep(2000);
		System.out.println("It is getting into Recruiters page");
		
	}
	
	public void SelectJobProfileHR() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-select-selector'])[8]")));
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[8]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[text()='Automation Tester'])[2]")).click();
	}
	
	public void SelectCalenderHRrounds() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Start date'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='22'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='28'])[8]")).click();
		Thread.sleep(2000);
		System.out.println(" HR Round data is showning");
		
	}
	
	
	
//	public static void takeScreenShotData(WebDriver webdriver) throws Exception{
//		
//		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//		
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//	
//		File DestFile=new File("C:\\Users\\Brigosha_Guest\\Desktop\\New folder");
//		
//		FileUtils.copyFile(SrcFile, DestFile);
//		}
//	
	
	public void getScreenShotAS(String name) {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
	    File file1 = ts1.getScreenshotAs(OutputType.FILE);
				
	    try {
	         // FileUtils.copyFile(file1, new File("./Screenshots/Test2_SearchUser.png"));
	    	 FileUtils.copyFile(file1, new File("./screenshot/"+name+".png"));
		} catch (IOException e) {
		e.printStackTrace();
	}
	}

	public void getScreenShottwo(String name) {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
	    File file1 = ts1.getScreenshotAs(OutputType.FILE);
				
	    try {
	         // FileUtils.copyFile(file1, new File("./Screenshots/Test2_SearchUser.png"));
	    	 FileUtils.copyFile(file1, new File("./screenshot/"+name+".png"));
		} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void getScreenShotThree(String name) {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
	    File file1 = ts1.getScreenshotAs(OutputType.FILE);
				
	    try {
	         // FileUtils.copyFile(file1, new File("./Screenshots/Test2_SearchUser.png"));
	    	 FileUtils.copyFile(file1, new File("./screenshot/"+name+".png"));
		} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void getScreenShotFour(String name) {
		TakesScreenshot ts1 = (TakesScreenshot)driver;
	    File file1 = ts1.getScreenshotAs(OutputType.FILE);
				
	    try {
	         // FileUtils.copyFile(file1, new File("./Screenshots/Test2_SearchUser.png"));
	    	 FileUtils.copyFile(file1, new File("./screenshot/"+name+".png"));
		} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
