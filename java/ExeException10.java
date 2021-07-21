package com.ust.examples;
class  StudentNotFoundExeption extends Exception{
	
public  StudentNotFoundExeption(String message) {
super(message);
}
}
 class Student2{
	
	Student2(){
}
}
 class StudentManager{
	 
 public Student2 find(String studentID) throws StudentNotFoundExeption {
 if (studentID.equals("123456")){
 return new Student2();
}
 else{
	   throw new StudentNotFoundExeption(
	   "Could not find student with ID" + studentID);
}
}	
}
public class ExeException10 {
public static void main(String[] args) {
	StudentManager manager	= new StudentManager();
	try {
	Student2 student =manager.find("0000001");
}
	catch ( StudentNotFoundExeption ex) {
		System.out.println(ex);
}
}
}
