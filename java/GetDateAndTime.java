package com.ust.examples;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetDateAndTime {

public static void main(String[] args)
 {
int day,month,year;
int second,minute,hour;
GregorianCalendar date= new GregorianCalendar();
//creating date object

 day= date.get(Calendar.DAY_OF_MONTH);
 //Storing day of the month
 
 month= date.get(Calendar.MONTH);
//Storing the month
 
 year= date.get(Calendar.YEAR); 
//Storing the current year
 
 second= date.get(Calendar.SECOND); 
 //Time in Seconds,Minutes and Hours
 minute=date.get(Calendar.MINUTE);
 hour=date.get(Calendar.HOUR);
 
 System.out.println("Current date is "+day+"/"+(month+1)+"/"+year);
 System.out.println("Current time is "+hour+":"+minute+":"+second);
 
 }
}

