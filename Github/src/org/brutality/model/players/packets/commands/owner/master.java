package org.brutality.model.players.packets.commands.owner;

import java.util.Optional;

import org.brutality.model.players.Player;
import org.brutality.model.players.PlayerHandler;
import org.brutality.model.players.Rights;
import org.brutality.model.players.packets.commands.Command;

/**
 * Promote a given player to a Sponsor.
 * 
 * @author Emiel
 *
 */
public class master implements Command {

	@Override
	public void execute(Player c, String input) {
		Optional<Player> optionalPlayer = PlayerHandler.getOptionalPlayer(input);
		if (optionalPlayer.isPresent()) {
			Player c2 = optionalPlayer.get();
			{
				for (int i = 0; i < 22; i++) {
					c.playerLevel[i] = 99;
					c.playerXP[i] = c.getPA().getXPForLevel(100);
					c.getPA().refreshSkill(i);	
				}
				c.getPA().requestUpdates();
			}
		}
	}
}
