package business.abstracts;


import entities.concretes.Games;

public interface GameService {
	
	void add(Games games);
	
	void delete(Games games);
	
	void update(Games games);
}
