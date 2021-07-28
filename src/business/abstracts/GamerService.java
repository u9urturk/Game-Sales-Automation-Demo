package business.abstracts;

import entities.concretes.Gamer;

public interface GamerService {
	
	void add(Gamer gamer) throws Exception;
	
	void delete(Gamer gamer);
	
	void update(Gamer gamer);
}
