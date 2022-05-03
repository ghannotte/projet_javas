package projet_java;

import java.sql.*;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;

public class init_database {
	
	static  String url = "jdbc:mysql://localhost:3306?serverTimezone=UTC&useSSL=false";
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
		   
		  String urls = "jdbc:mysql://localhost:3306"+"/"+dbname+"?serverTimezone=UTC&useSSL=false";
		  
		   try(Connection conn = DriverManager.getConnection(urls,user, mdp);
			         Statement stmt = conn.createStatement();
			      ) {
			         
			         String sql2 = "CREATE Table assure(Numero_Securite_Sociale int,Nom varchar(20), Prenom varchar(20), Date_Naissance date, Numero_Telephone varchar(13) , E_Mail varchar(20), ID_Remboursement int , Code_Soin int, Montant_Remboursement int)";
			         stmt.executeUpdate(sql2);
			         System.out.println("Table assure est crée");
			      } catch (SQLException e) {
			    	  
			      }
		   try {
			      File myObj = new File("dbconfig.csv");
			      if (myObj.createNewFile()) {
			    	  FileWriter myWriter = new FileWriter("dbconfig.csv");
			          myWriter.write(dbname+","+user+"," + mdp);
			          myWriter.close();
			 			        
			      } else {
			    	  FileWriter myWriter = new FileWriter("dbconfig.csv");
			          myWriter.write(dbname+","+user+"," + mdp);
			          myWriter.close();
			      }
			    } catch (IOException e) {
			      
			    }
      }
		   
	   
	   
}
