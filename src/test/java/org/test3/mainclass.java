package org.test3;

import java.io.IOException;

import org.test1.baseclass;
import org.test2.pojoclass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class mainclass extends baseclass {

	@BeforeSuite
	private void tc1() {
		browserlaunch();
		launchurl("https://adactinhotelapp.com/");
		
	}
	@Test
	private void tc2() throws IOException, InterruptedException {
		pojoclass p=new pojoclass();
		Thread.sleep(2000);
		fill(p.getTextuser(), exceldata(1, 0));
		fill(p.getTxtpassword(), exceldata(1, 1));
		buttonclick(p.getTxtlogin());
		selectbyvisibletext(p.getLocation(),"London");
		selectbyvisibletext(p.getHotel(), "Hotel Hervey");
		selectbyindex(p.getRoomtype(), 3);
		selectbyindex(p.getNumberrooms(), 2);
		fill(p.getSelectdate(), "20/12/2020");
		fill(p.getCheckout(), "22/12/2020");
		selectbyindex(p.getAdultsroom(), 2);
		selectbyindex(p.getChildroom(), 2);
		buttonclick(p.getClick());
		buttonclick(p.getHotelselectclick());
		buttonclick(p.getContinueclick());
		fill(p.getFirstname(), "dhinesh");
		fill(p.getLastname(), "charls");
		fill(p.getAdress(), "chennai tamiladu");
		fill(p.getCardnumber(), "1211311060251121");
		selectbyindex(p.getCardtype(), 2);
		selectbyindex(p.getExpiremonth(), 5);
		selectbyindex(p.getSelectyear(), 4);
		fill(p.getCvvnumber(), "455");
		buttonclick(p.getBooknowbutton());
		
		

	}
	
	
	
}
