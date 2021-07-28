package business.concretes;

import business.abstracts.CheckIfRealPersonService;
import entities.concretes.Gamer;

public class CheckIfRealPersonManager implements CheckIfRealPersonService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
