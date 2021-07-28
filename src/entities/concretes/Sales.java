package entities.concretes;

import java.sql.Time;
import java.util.Date;

public class Sales {
	
	int id;
	
	String customerName;
	
	String gameName;
	
	String salesDate;
	
	double price;
	
	double promotionalSellingPrice;

	public Sales() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(String string) {
		this.salesDate = string;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPromotionalSellingPrice() {
		return promotionalSellingPrice;
	}
	
	public void setPromotionalSellingPrice(double  promotionalSellingPrice) {
		this. promotionalSellingPrice =  promotionalSellingPrice;
	}
}
