package business.concretes;

import business.abstracts.CheckIfRealPersonService;
import business.abstracts.GamerService;
import entities.concretes.Gamer;

public class GamerManager implements GamerService {
	
	private CheckIfRealPersonService checkIfRealPersonService;

	public GamerManager(CheckIfRealPersonService checkIfRealPersonService) {
		super();
		this.checkIfRealPersonService = checkIfRealPersonService;
	}

	@Override
	public void add(Gamer gamer) throws Exception {
		
		if(checkIfRealPersonService.checkIfRealPerson(gamer)){
			System.out.println("Mernis doðrulamasý baþarýlý ! ");
			System.out.println("                      ");
			System.out.println(gamer.getFirstName() + " isimli oyuncu kaydý gerçekleþti.");
		}else {
			
			throw new Exception("Not is a valid person");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
}
