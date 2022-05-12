package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//to open the browser and the the url
     	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
				
				
		//to login the testleaf page
				
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    String text=driver.findElement(By.tagName("h2")).getText();
	    System.out.println(text);
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
			    
	     //to Create  a new lead
			    
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();  
		        
        //to fill the Apllication
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
        
   	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
   	   
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("swetha");
        
          
         driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
         
         driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Miss");
         
         driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000"); 
         
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
         
         driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
         
         driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("31/05/2000");
         
         
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("department");
         
         driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
         

         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9092992231");
         
         driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No53 Gandhi nagar Chennai-28");
         
         driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
         
         driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600028");
         
         
   	     WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select obj1=new Select(source);
         obj1.selectByVisibleText("Employee");
         
         
         WebElement industryEnumid=driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select obj2=new Select(industryEnumid);
         obj2.selectByIndex(2);
         
         
         WebElement ownershipEnumid=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select obj3=new Select(ownershipEnumid);
         obj3.selectByValue("OWN_CCORP");
         
         
         WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select obj4=new Select(marketing);
         obj4.selectByVisibleText("Automobile"); 
         
        
         WebElement eledropdown5=driver.findElement(By.id("createLeadForm_currencyUomId"));
		 Select obj5=new Select(eledropdown5);
         obj5.selectByValue("INR");
         
          WebElement generalstate=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	     Select obj6=new Select(generalstate);
         obj6.selectByValue("TX"); 
         
         
         WebElement generalcountry=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
         Select obj7=new Select(generalcountry);
         obj7.selectByVisibleText("India"); 
              
          
          //to print the first name
         String firstname=driver.findElement(By.name("firstName")).getText();
         System.out.println(firstname);
          //to submit the Application
              
          driver.findElement(By.name("submitButton")).click();
           
          // to view the new lead     
           String Final=driver.getTitle();
      	   System.out.println(Final);
              
              
              
         
      
         
         
         
         
         
         
         
         
         
         
   	     
   	     
   	 
	}
	

}
