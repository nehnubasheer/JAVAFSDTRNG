package com.ust.examples;
//Encapsulation
class patient{
private String name;
private int age;
private boolean vaccinestatus;
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isVaccinestatus() {
	return vaccinestatus;
}
public void setVaccinestatus(boolean vaccinestatus) {
	this.vaccinestatus = vaccinestatus;

if (vaccinestatus==true) {
	System.out.println("congratulations");	
}
else {
	System.out.println("please got vacinates ASAP");
}
}
}

public class TestData {
	
	public static void main(String[] args) {
		patient p= new patient();
		p.setVaccinestatus(false);
		System.out.println(p.isVaccinestatus());		
}
}
