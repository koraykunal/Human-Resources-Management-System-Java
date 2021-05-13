package Concrete;

import java.awt.List;
import java.util.ArrayList;

import Abstract.IGameService;
import Abstract.IPlayerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameManager implements IGameService{
	private IPlayerService iPlayerService;
	ArrayList<Game> games= new ArrayList<Game>();
	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println("Game succesfully added : " + game.getName());
		
	}

	@Override
	public void update(Game game, int id, String name, double price) {
		for(Game upGame:games) {
			if(game.getGameId()==upGame.getGameId()) {
				game.setGameId(id);
				game.setName(name);
				game.setPrice(price);
			}
		}
		System.out.println("Game succesfully updated : "+ game.getName());
		 
	}

	@Override
	public void delete(int id) {
		for(Game upGame:games) {
			if(upGame.getGameId() == id) {
				games.remove(upGame);
				System.out.println("Game succesfully deleted : "+ upGame.getName());
			}
		}
		
		
	}

	@Override
	public void sell(Game game, Player player, IPlayerService iPlayerService) {
		this.iPlayerService=iPlayerService;
		iPlayerService.buy(game);
		
	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		double newPrice = game.getPrice()*campaign.getDiscount()/100;
		game.setPrice(newPrice);
		System.out.println("New price is : " + game.getPrice());
		
	}
	
}
