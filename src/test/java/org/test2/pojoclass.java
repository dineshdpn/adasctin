package org.test2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test1.baseclass;

public class pojoclass extends baseclass {

	public pojoclass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement textuser;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement txtlogin;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement numberrooms;
	@FindBy(id = "datepick_in")
	private WebElement selectdate;
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	@FindBy(id = "adult_room")
	private WebElement adultsroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement click;
	@FindBy(id="radiobutton_0")
	private WebElement hotelselectclick;
	@FindBy(id="continue")
	private WebElement continueclick;
	@FindBy(id="first_name")
	private WebElement  firstname;
	@FindBy(id="last_name")
	private WebElement lastname; 
	@FindBy(id="address")
	private WebElement adress;
	@FindBy(id="cc_num")
	private WebElement cardnumber; 
	public WebElement getHotelselectclick() {
		return hotelselectclick;
	}

	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement expiremonth;
	@FindBy(id="cc_exp_year")
	private WebElement selectyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement booknowbutton;
	public WebElement getTextuser() {
		return textuser;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getTxtlogin() {
		return txtlogin;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNumberrooms() {
		return numberrooms;
	}
	public WebElement getSelectdate() {
		return selectdate;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultsroom() {
		return adultsroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getContinueclick() {
		return continueclick;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCardnumber() {
		return cardnumber;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpiremonth() {
		return expiremonth;
	}
	public WebElement getSelectyear() {
		return selectyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknowbutton() {
		return booknowbutton;
	}
	
	
	
	
	
	
	
	
	
	
}
