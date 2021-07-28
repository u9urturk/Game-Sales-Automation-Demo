package entities.concretes;

import entities.abstracts.Entity;

public class Campaing implements Entity{
	
	int id;
	
	int percentageRate;

	public Campaing() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPercentageRate() {
		return percentageRate;
	}

	public void setPercentageRate(int percentageRate) {
		this.percentageRate = percentageRate;
	}
}
