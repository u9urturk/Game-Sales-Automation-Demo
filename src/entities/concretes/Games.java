package entities.concretes;

import entities.abstracts.Entity;

public class Games implements Entity {
	
	int id ;
	
	String gameName;
	
	double price;
	
	

	public Games() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	

}
