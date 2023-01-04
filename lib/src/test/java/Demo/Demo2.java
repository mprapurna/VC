package Demo;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Demo2 {
		public static WebDriver driver;
		   public static WebDriverWait wait;
		   
		   public WebElement waitUntilElementLocated(String text) {
			   wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			  
			   WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));
			   
			  // WebElement element1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		       return element1;
		   }
		   
		   @BeforeTest
		   public void setUp2(){
			   driver=new ChromeDriver();
				//	WebDriverWait wait =new WebDriverWait(driver,20); 
					//WebDriverWait wait1=new WebDriverWait();
					String ProjectPath=System.getProperty("user.dir");
					System.out.println(ProjectPath);
					System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/Chrome/chromedriver.exe");
		   }
		   
		   @Test
			public void verifytest2() throws InterruptedException {
				
				driver=new ChromeDriver();
			//	WebDriverWait wait =new WebDriverWait(driver,20); 
				//WebDriverWait wait1=new WebDriverWait();
				String ProjectPath=System.getProperty("user.dir");
				System.out.println(ProjectPath);
				System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/Chrome/chromedriver.exe");
				//driver.get("https://www.google.com/");
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				
				//driver.manage().window().maximize();
				//System.out.println(driver.getTitle());
			
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
				
				//driver.close();
				
				String eTitle = "Demo Guru99 Page";
				String aTitle = "" ;
				// launch Chrome and redirect it to the Base URL
				driver.get("http://demo.guru99.com/test/guru99home/" );
				//Maximizes the browser window
				driver.manage().window().maximize() ;
				//get the actual value of the title
				aTitle = driver.getTitle();
				//compare the actual title with the expected title
				Assert.assertEquals(aTitle, eTitle);
				if (aTitle.contentEquals(eTitle))
				{
				System.out.println( "Test Passed") ;
				}
				else {
				System.out.println( "Test Failed" );
				}
				WebElement guru99seleniumlink;
				String link="//a[contains(text(),'Home')]";
				//waitUntilElementLocated().click();
				WebElement link1=waitUntilElementLocated(link);
				link1.click();
				//guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
				//guru99seleniumlink.click();
				Thread.sleep(3000);
		   }
		   @Test
		   public void testGoogle2() {
			   
			 driver.get("https://www.google.com/");
			driver.manage().window().maximize();
					System.out.println(driver.getTitle());
				
			 		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   }
		   @AfterTest
		   public void tearDown() {
				driver.close();
				driver.quit();
			}
		}

