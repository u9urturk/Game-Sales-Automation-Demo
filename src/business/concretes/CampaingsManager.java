package business.concretes;

import business.abstracts.CampaingsService;
import entities.concretes.Campaing;

public class CampaingsManager implements CampaingsService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("                      ");
		System.out.println("Baþarýlý , indirim tanýmlandý : " + "%" + campaing.getPercentageRate());
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println("Baþarýlý , indirim silindi : " + "%" + campaing.getPercentageRate());
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Baþarýlý , indirim güncellendi : " + "%" + campaing.getPercentageRate());
		
	}

	@Override
	public void getCampaingById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double campaingOperation(double percentageRate, double price) {
		
		double result =  price - (price * (percentageRate / 100));
		
		return result;
		
	}

}
