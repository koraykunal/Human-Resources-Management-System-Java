import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class main {

	public static void main(String[] args) {
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Koray");
		player.setLastName("Kunal");
		player.setNationalityId("11515741128");
		player.setDateOfBirth(2000);
		
		Game game1 = new Game(1, "Shei", LocalDate.of(2021,9,15), 50);
		Campaign campaign1 = new Campaign(1, "Summer Sale", 70);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		PlayerManager manager = new PlayerManager(new MernisServiceAdapter());
		manager.register(player);
		
		gameManager.addCampaign(game1, campaign1);
		manager.buy(game1);
		
	}

}
