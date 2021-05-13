package Abstract;

import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameService {
	public void add(Game game);
	public void update(Game game, int id, String name, double price);
	public void delete(int id);
	public void sell(Game game, Player player, IPlayerService iPlayerService);
	public void addCampaign(Game game, Campaign campaign);
}
