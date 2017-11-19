package sh.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DbInterface extends Remote {
	
	public String registerAnimal() throws RemoteException;
	
	

}
