package sh.rmiserver;



import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class DbServer {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry( 1099 );
			
			DbController dbController = new DbController();
			
			Naming.rebind("dbServices", dbController);
			
			//System.out.println( "Db Server listening on " + InetAddress.getLocalHost().getHostAddress() );
			System.out.println("Db Server is running...");
		} catch( Exception ex ) {
			ex.printStackTrace();
		}

	}

}
