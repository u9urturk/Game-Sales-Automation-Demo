package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Games;

public class GamesManager implements GameService {

	@Override
	public void add(Games games) {
		
		
		System.out.println("                      ");
		System.out.println("Ba�ar�l� , Oyun sisteme kay�t edildi : " + games.getGameName());
		
	}

	@Override
	public void delete(Games games) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Games games) {
		// TODO Auto-generated method stub
		
	}

}
