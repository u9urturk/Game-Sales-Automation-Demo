package business.abstracts;

import entities.concretes.Sales;

public interface SalesService {
	
	void sell(Sales sales , double percentageRate);
	
}
