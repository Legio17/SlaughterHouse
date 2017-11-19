package sh.rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import sh.common.DbInterface;

public class DbController extends UnicastRemoteObject implements DbInterface {

	protected DbController() throws RemoteException {
		super();
	}

	public String registerAnimal() throws RemoteException {
		
		return "Animal registered";
		
	}

}
