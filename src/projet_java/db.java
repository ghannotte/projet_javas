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
public class db extends init_database{
	
	static final String uri = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false";
	
	 public static void  insert(String[] dbname) {
		 
		 
				 String query1 = "INSERT INTO InsertDemo " + "VALUES ("+dbname[0]+","+"'"+dbname[1]+"'"+","+"'"+dbname[2]+"'"+","+"'"+dbname[3]+"'"+","+"'"+dbname[4]+"'"+","+"'"+dbname[5]+"'"+","+dbname[6]+","+dbname[6]+","+dbname[8]+")";
				 System.out.println(query1.replaceAll("[\\[\\]]", ""));
				 
				 try(Connection conn = DriverManager.getConnection(uri,user, mdp);
				         Statement stmt = conn.createStatement();
				      ) {		      
				         stmt.executeUpdate(query1.replaceAll("[\\[\\]]", ""));  	  
				      } catch (SQLException e) {
				    	  e.printStackTrace();
				      } 
				   }
				 	
	 
 }
