/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author janan
 */
import java.sql.*;
public class DBConnect {		
        public static void main(String args[]){
	try{
	        //step1 load the driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");		
	        //step2 create the connection object
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Department", "root","Janani@2004");			
                //step3 create the statement object
	        Statement stmt=con.createStatement();
	
	//step4 execute query
	//ResultSet rs=stmt.executeQuery("create table employee (empid number(4), empname varchar2(25))");
        stmt.executeUpdate("insert into dep_info values(4,'EEE')");
	stmt.executeUpdate("update dep_info set dep_info set dep_name='Mech' where dep_code=4");
	//ResultSet rs=stmt.executeQuery("select * from dep_info");
	//while(rs.next())
	//System.out.println(rs.getInt(1)+" "+rs.getString(2));
	stmt.executeUpdate("delete from employee");
	//step5 close the connection object
	con.close();		
	}catch(Exception e){ System.out.println(e);}  		
       } 	
}


