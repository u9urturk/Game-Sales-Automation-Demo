package business.concretes;


import java.text.SimpleDateFormat;
import java.util.Date;

import business.abstracts.CampaingsService;
import business.abstracts.SalesService;
import entities.concretes.Sales;

public class SalesManager implements SalesService {
	
	private CampaingsService campaingsService;
	
	public SalesManager(CampaingsService campaingsService) {
		super();
		this.campaingsService = campaingsService;
	}
	
	@Override
	public void sell(Sales sales ,double percentageRate) {
		
		sales.setPromotionalSellingPrice(
				campaingsService.campaingOperation(percentageRate, sales.getPrice()));
		
		SimpleDateFormat customFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		sales.setSalesDate(customFormat.format(new Date()));
				
		System.out.println("                      ");
		System.out.println("Satýþ Baþarý ile gerçekleþti.... ");
		System.out.println("                      ");
		
		System.out.println("Müþteri adý : " + sales.getCustomerName() + "\n" + 
				"Oyun adý : "  + sales.getGameName() + "\n"+
				"Satýþ fiyatý : " + sales.getPrice() +"\n" +
				"Kampanyalý satýþ fiyatý : " + sales.getPromotionalSellingPrice()
				+"\n"+"Satýþ zamaný : "  + sales.getSalesDate());
		
	}

}
