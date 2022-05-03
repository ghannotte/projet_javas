package projet_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.nio.charset.StandardCharsets;
import java.sql.*;
public class db extends init_database implements import_all{
	
	
	 public static void  insert(String[] dbname) {
		         List u =import_csv.creat("dbconfig.csv");
		         String[] a=finder_class.split(u);
		         String uri = "jdbc:mysql://localhost:3306/"+a[0].replaceAll("[\\[\\]]", "")+"?serverTimezone=UTC&useSSL=false";
				 String query1 = "INSERT INTO assure " + "VALUES ("+dbname[0]+","+"'"+dbname[1]+"'"+","+"'"+dbname[2]+"'"+","+"'"+dbname[3]+"'"+","+"'"+dbname[4]+"'"+","+"'"+dbname[5]+"'"+","+dbname[6]+","+dbname[7]+","+dbname[8]+")";
				 String users= a[1].toString();
				 String mdps= a[2].toString();
				 
				 
				 try(Connection conn = DriverManager.getConnection(uri,users.replaceAll("[\\[\\]]", ""), mdps.replaceAll("[\\[\\]]", ""));
				         Statement stmt = conn.createStatement();
				      ) {		      
				         stmt.executeUpdate(query1.replaceAll("[\\[\\]]", ""));  	  
				      } catch (SQLException e) {
				    	  e.printStackTrace();
				      } 
				   }
				 	
	 
 }
