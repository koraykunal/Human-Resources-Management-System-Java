package Abstract;

import Entities.Game;
import Entities.Player;

public interface IPlayerService {
	public void register(Player player);
	public void login(Player player);
	public void update(Player player);
	public void remove(Player player);
	public void buy(Game game);
}
