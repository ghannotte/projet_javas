package projet_java;

import java.sql.*;


public class init_database {
	
	static final String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC&useSSL=false";
	   static final String user = "root";
	   static final String mdp = "root";

	   
	   public static void  Creatdb(String dbname) {
		 
		   try(Connection conn = DriverManager.getConnection(url,user, mdp);
			         Statement stmt = conn.createStatement();
			      ) {		      
			         String sql = "CREATE DATABASE "+dbname;
			         stmt.executeUpdate(sql);
			         System.out.println("Database "+dbname+" est cree");   	  
			      } catch (SQLException e) {
			    	  e.printStackTrace();
			      } 
			   }
		   
	   
}
