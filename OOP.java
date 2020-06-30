package dev.java.propenster;

public class OOP{
	
	// Instance Variables...Fields...
	private int UUID;
	private String userName;
	private String userAddress;
	private String userCountry;
	private String userPhone;
	private String zipCode;
	private double userBalance;

	//no-args Constructor....should no values be supplied at instantiation
	//i.e. during object creation...at runtime...
	public OOP(){
		this.UUID = 0;
		this.userName = null;
		this.userAddress = null;
		this.userCountry = null;
		this.userPhone = null;
		this.zipCode = null;
		this.userBalance = 0.000000;
	}

	//Args-Constructor.....
	public OOP(int UUID, String userName, String userAddress, String userCountry, String userPhone, String zipCode, double userBalance){
		this.UUID = UUID;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userCountry = userCountry,
		this.userPhone = userPhone;
		this.zipCode = zipCode;
		this.setUserBalance(userBalance);

	}//Close the Constructor...

	public void setUUID(int UUID){

	}
	public int getUUID(){
		return this.UUID;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}
	public String getUserAddress(){
		return this.userAddress;
	}
	public void setUserCountry(String userCountry){
		this.userCountry = userCountry;
	}
	public String getUserCountry(){
		return this.userCountry;
	}
	public void setUserPhone(String userPhone){
		this.userPhone = userPhone;
	}
	public String getUserPhone(){
		return this.userPhone;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public String getZipCode(){
		return this.zipCode;
	}
	public void setUserBalance(double userBalance){
		this.userBalance = userBalance;
	}
	public double getUserBalance(){
		return this.userBalance;
	}


	public void getUserAccountSummary(){
		System.out.println("User Account Summary");
		System.out.println("======================");
		System.out.println("ID: {0}\nUser Name: {1}\nAddress: {2}\nCountry: {3}\nPhone: {4}\nZip Code: {5}\nAccount Balance: {6}",(getUUID(), getUserName(), getUserAddress(), getUserCountry(), getUserPhone(), getZipCode(), getUserBalance()));
	}

	//Withdraw money..from user's account
	public void Withdraw(double amount){
		getUserBalance -= amount;
	}



	public static void main(String[] args) {
		//Create an object of the Class "OOP"
		OOP newUserObject = new OOP();
		//Let's use the no-args Constructor first...to initialize the object
		newUserObject.getUserAccountSummary();
		//You should get 0 for ID and nulls for most of the other fields...

		//Now Let's create another object but now, fill it with argsss
		OOP anotherUserObject = new OOP(2, "Propenster487", "5, Geteloma Close, Sasa Area, Ibadan", "Nigeria", "+2348109354862", "200132", 120000000.1250);
		anotherUserObject.getUserAccountSummary();
	}
}