package business.abstracts;

import entities.concretes.Campaing;

public interface CampaingsService {
	
	void add(Campaing campaing);
	
	void delete(Campaing campaing);
	
	void update(Campaing campaing);
	
	
	void getCampaingById(int id);
	
	double campaingOperation(double percentageRate , double price);
}
