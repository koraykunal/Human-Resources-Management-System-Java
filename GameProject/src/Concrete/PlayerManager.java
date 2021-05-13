package Concrete;

import java.util.ArrayList;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Game;
import Entities.Player;

public class PlayerManager implements IPlayerService{
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	ArrayList<Game> gamelist = new ArrayList<Game>();
	
	private IPlayerCheckService checkService;
	
	public PlayerManager(IPlayerCheckService checkService) {
		this.checkService=checkService;
	}
	@Override
	public void register(Player player) {
		
		if(checkService.checkIfRealPerson(player)==true) {
			System.out.println("You are succesfully registered");
		}
		else {
			throw new ArithmeticException("Not a Valid Person");
		}
		
	}

	@Override
	public void login(Player player) {
		
		System.out.println("Giris Yapildi..");
		
	}

	@Override
	public void update(Player player) {
		
		System.out.println("Oyuncu bilgileri güncellendi..");
		
	}

	@Override
	public void remove(Player player) {
		
		System.out.println("Oyuncu silindi..");
		
	}
	@Override
	public void buy(Game game) {
		gamelist.add(game);
		System.out.println("You bought this game successed : " + game.getName());
	}

}
