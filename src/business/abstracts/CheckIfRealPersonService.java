package business.abstracts;

import java.rmi.RemoteException;

import entities.concretes.Gamer;

public interface CheckIfRealPersonService {
	
	boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;
}
