package com.ust.trng;
import java.util.*;  
import java.sql.*;    
public class StudentDAO 
{  	
public static Connection getConnection()
{        
    Connection con=null;  
try
{  
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
   // con=DriverManager.getConnection("jdbc:mysql://localhost:3306/samples\",\"root\",\"root");  
}
catch(Exception e){System.out.println(e);
}  
return con;  
}  
public static int save(Student e)
{  
int status=0;  
try
{  
	Connection con=StudentDAO.getConnection();  
	PreparedStatement ps=con.prepareStatement(  
	 "insert into student(name,password,email,country) values (?,?,?,?)");  
	ps.setString(1,e.getName());  
	ps.setString(2,e.getPassword());  
    ps.setString(3,e.getEmail());  
	ps.setString(4,e.getCountry());       
	status=ps.executeUpdate();           
	    con.close(); 
}
catch(Exception ex){ex.printStackTrace();
}           
return status;  
}  
public static int update(Student e)
{  
int status=0;  
try
{  
	Connection con=StudentDAO.getConnection();  
	PreparedStatement ps=con.prepareStatement(  
	"update student set name=?,password=?,email=?,country=? where id=?");  
	ps.setString(1,e.getName());  
	ps.setString(2,e.getPassword());  
    ps.setString(3,e.getEmail());  
    ps.setString(4,e.getCountry());  	            
    ps.setInt(5,e.getId());           
	status=ps.executeUpdate();  	           
	con.close(); 
}
catch(Exception ex){ex.printStackTrace();
}            
return status;  
}  
public static int delete(int id)
{  
int status=0;  
try
{  
    Connection con=StudentDAO.getConnection();  
	PreparedStatement ps=con.prepareStatement("delete from student where id=?");  
	ps.setInt(1,id);  
	status=ps.executeUpdate();  	              
	con.close();  
}
catch(Exception e){e.printStackTrace();
}  	        
return status;  
}  
public static Student getStudentById(int id)
{  
    Student e=new Student();  
try
{  
    Connection con=StudentDAO.getConnection();  
	PreparedStatement ps=con.prepareStatement("select * from student where id=?");  
	ps.setInt(1,id);  
    ResultSet rs=ps.executeQuery();  
if(rs.next())
{  
    e.setId(rs.getInt(1));  
    e.setName(rs.getString(2));  	               
    e.setPassword(rs.getString(3));  
    e.setEmail(rs.getString(4));  
    e.setCountry(rs.getString(5));  
}  
    con.close();  
}
catch(Exception ex){ex.printStackTrace();
}  
return e ;  
}  
  public static List<Student> getAllStudents(){  
  List<Student> list=new ArrayList<Student>();  
	          
 try
 {  
   Connection con=StudentDAO.getConnection();  
   PreparedStatement ps=con.prepareStatement("select * from student");  
   ResultSet rs=ps.executeQuery();  
 while(rs.next()){  
   Student e=new Student();  
   e.setId(rs.getInt(1));  
   e.setName(rs.getString(2));  
   e.setPassword(rs.getString(3));   
   e.setEmail(rs.getString(4));  
   e.setCountry(rs.getString(5));  
   list.add(e);  
 }  
 con.close();  	       
 }
 catch(Exception e){e.printStackTrace();
 }  	          
 return list;  
}  
}  

