package sh.rmiclient;
import java.sql.*;

import java.rmi.Naming;

import static sh.common.DbConfig.*;
import sh.common.*;


public class DbServerClient {
	
	public static void main(String[] args) {
		try {

			String url = "rmi://127.0.0.1/" + SERVICE_NAME;
			
			 DbInterface dbServices = (DbInterface) Naming.lookup( url );
			
			System.out.println(dbServices.registerAnimal());
		} catch( Exception ex ) {
			ex.printStackTrace();
		}

	}
	

}
