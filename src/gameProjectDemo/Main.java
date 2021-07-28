package gameProjectDemo;

import java.util.Date;

import adapters.MernisManager;
import business.abstracts.CampaingsService;
import business.abstracts.GameService;
import business.abstracts.GamerService;
import business.abstracts.SalesService;
import business.concretes.CampaingsManager;
import business.concretes.GamerManager;
import business.concretes.GamesManager;
import business.concretes.SalesManager;
import entities.concretes.Campaing;
import entities.concretes.Gamer;
import entities.concretes.Games;
import entities.concretes.Sales;

public class Main {

	public static void main(String[] args) throws Exception {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("****");
		gamer.setLastName("****");
		gamer.setNationalityId("********");
		gamer.setDateOfBirth(new Date(****,**,**));
		
		GamerService gamerService = new GamerManager(new MernisManager());
		gamerService.add(gamer);
		
		Games games = new Games();
		games.setId(1);
		games.setGameName("Watch Dogs 2");
		games.setPrice(100);
		
		GameService gameService = new GamesManager();
		gameService.add(games);
		
		Campaing campaing = new Campaing();
		campaing.setId(1);
		campaing.setPercentageRate(39);
		
		CampaingsService campaingsService = new CampaingsManager();
		campaingsService.add(campaing);
		
		
		Sales sales = new Sales();
		sales.setId(1);
		sales.setCustomerName(gamer.getFirstName() + " " + gamer.getLastName());
		sales.setGameName(games.getGameName());
		sales.setPrice(games.getPrice());
		
		SalesService salesService = new SalesManager(new CampaingsManager());
		salesService.sell(sales,campaing.getPercentageRate());
		

	}

}
