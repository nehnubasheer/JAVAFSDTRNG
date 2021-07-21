package com.ust.examples;
// credit card is super class
class CreditCards{
	private String cardName;//instance variable
	private int expiryDate;
	private float creditBalance;
	
	CreditCards()
	{
		cardName="Nehnu";
		expiryDate=05-11-2025;
		creditBalance=60000;
	}
	void checkCardBalance()
	{
	if(creditBalance>=40000)
	{
		System.out.println("Sufficient balance");	
	}
	else
	{
		System.out.println("Not Much");
	}	
	}
	void makePayment9() {}
 }
 //visa is a sub class
 class Visa extends CreditCards
 {
 float intrestRate;
 float creditLimits;
 //Visa(String x, int y, float z){
 Visa()
 {
 	super();
 }
 void checkDiscounts()
 {
 	System.out.println("Many discounts will be provided");  
 }
 }
 //mastercard is also a subclass
class MasterCard extends CreditCards
{
	   void checkPaymentsOption()
{
  System.out.println("Online Payment mode is available");	   
}
}
public class Program1 {

	public static void main(String[] args) 
	{
	//Visa V=new Visa("Nehnu",123,3000.65f);	
	Visa V=new Visa();
	V.checkCardBalance();
	}

}
