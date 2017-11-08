package tests;


import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.Configs1;
import locators.Loactors;


public class WebTestsInTestNG extends Configs1 {


	//Accesing loctors class from Loactor pakage By creating object ref to Locators class
	Loactors SL= new Loactors();

	@Test(priority=1)
	public void displayItems(){

		APPLICATION_LOG.debug("DisplayItems Test started");//logging test starts

		//Navigating to webpage 
		driver.get(baseURL);

		// Storing html elements
		WebElement item3=driver.findElement(By.xpath(SL.item3));
		WebElement item5=driver.findElement(By.xpath(SL.item5));

		//Displaying 3rd and 5th food item elements
		System.out.println("                                                                          ");
		System.out.println("==============Displaying 3rd and 5th food item elements===================");
		System.out.println("Third item from the list is:>> " + item3.getText());
		System.out.println("Fifth item from the list is:>> " +item5.getText());
		System.out.println("==============xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx===================");
		System.out.println("                                                                          ");
		
		APPLICATION_LOG.debug("DisplayItems Test ended"); ////logging test ends
	}

	@Test(priority=2)
	public void storFoodItemsAndServings(){

		APPLICATION_LOG.debug("StorFoodItemsAndServings Test started"); //logging test starts

		//Storing food item elements
		WebElement item1=driver.findElement(By.xpath(SL.item1));
		WebElement item2=driver.findElement(By.xpath(SL.item2));
		WebElement item3=driver.findElement(By.xpath(SL.item3));
		WebElement item4=driver.findElement(By.xpath(SL.item4));
		WebElement item5=driver.findElement(By.xpath(SL.item5));
		//Storing food items's serving elements
		WebElement itemServing1=driver.findElement(By.xpath(SL.itemServing1));
		WebElement itemServing2=driver.findElement(By.xpath(SL.itemServing2));
		WebElement itemServing3=driver.findElement(By.xpath(SL.itemServing3));
		WebElement itemServing4=driver.findElement(By.xpath(SL.itemServing4));
		WebElement itemServing5=driver.findElement(By.xpath(SL.itemServing5));


		//Storing Food items and their servings in A map as Key & Value pairs 
		Map<String,String> itemAndServing= new HashMap<String,String>();

		itemAndServing.put(item1.getText(), itemServing1.getText());
		itemAndServing.put(item2.getText(), itemServing2.getText());
		itemAndServing.put(item3.getText(), itemServing3.getText());
		itemAndServing.put(item4.getText(), itemServing4.getText());
		itemAndServing.put(item5.getText(), itemServing5.getText());

		//Displaying Food items and their servings as key & value pairs
		System.out.println("==============Displaying Food items and their servings as key & value pairs===================");
		System.out.println("----------------------------------------------------------"); 
		for(Map.Entry<String,String> m:itemAndServing.entrySet()){    
			System.out.println(m.getKey()+":>>>> "+m.getValue());  
			System.out.println("----------------------------------------------------------");
		}

		System.out.println("==============xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx===================");

		APPLICATION_LOG.debug("StorFoodItemsAndServings Test ended"); //logging test ends
	}

}
