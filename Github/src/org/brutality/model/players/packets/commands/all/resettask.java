package org.brutality.model.players.packets.commands.all;

import org.brutality.model.players.Player;
import org.brutality.model.players.packets.commands.Command;

public class resettask implements Command {

	@Override
	public void execute(Player c, String input) {
			if (c.slayerPoints >= 10) {
				c.sendMessage("For the cost of 10 slayer points, you reset your slayer task!");
				c.taskAmount = -1;
				c.slayerTask = 0;
				c.slayerPoints -= 10;
			} else {
				c.sendMessage("You don't have enough slayer points to complete this action.");
			}
	}
	
}