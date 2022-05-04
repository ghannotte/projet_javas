package projet_java;


import java.util.*;
import java.io.File;
import java.io.*;
import java.nio.*;
import java.sql.*;
 

public class db extends init_database implements import_all{
	
	
	 public static void  insert(String[] dbname) {
		         List u =import_csv.creat("dbconfig.csv");
		         String[] a=finder_class.split(u);
		         String uri = "jdbc:mysql://localhost:3306/"+a[0].replaceAll("[\\[\\]]", "")+"?serverTimezone=UTC&useSSL=false";
				 String query1 = "INSERT INTO assure " + "VALUES ("+dbname[0]+","+"'"+dbname[1]+"'"+","+"'"+dbname[2]+"'"+","+"'"+dbname[3]+"'"+","+"'"+dbname[4]+"'"+","+"'"+dbname[5]+"'"+","+dbname[6]+","+dbname[7]+","+dbname[8]+")";
				 String query2 = "INSERT INTO historic " + "VALUES ("+dbname[6]+","+"'INSERT',"+"'"+dbname[9]+"'"+")";
				 String users= a[1].toString();
				 String mdps= a[2].toString();
				 
				 
				 try(Connection conn = DriverManager.getConnection(uri,users.replaceAll("[\\[\\]]", ""), mdps.replaceAll("[\\[\\]]", ""));
				         Statement stmt = conn.createStatement();
				      ) {		      
				         stmt.executeUpdate(query1.replaceAll("[\\[\\]]", ""));
				         stmt.executeUpdate(query2); 
				      } catch (SQLException e) {
				    	  e.printStackTrace();
				    	  tool_file.write(dbname,"rejet/rejet_"+dbname[9]+".csv");
				    	   
				   }
				 
				 	
	 }
 }
