package sh.dbserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {
	
	public static void main(String[] args) {
		connectToDbServer();
	}
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/slaughterhousedb";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "localhost";
	
	public static void connectToDbServer(){
		Connection conn = null;
		Statement stmt = null;
		
		try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      
		      //STEP 6: Clean-up environment
//		      stmt.close();
		      conn.close();
		      
		}catch(SQLException se){
		      	se.printStackTrace();
		}catch(Exception e){
		      	e.printStackTrace();
		}finally{ 
			try{
				if(stmt!=null)
					stmt.close();
		   }
		   	catch(SQLException se2){
			   try{
				   if(conn!=null)
					   conn.close();
			   	}
		   	  catch(SQLException se){
		   		  se.printStackTrace();}
		   	}
		}
	}
}
