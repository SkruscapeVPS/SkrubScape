package org.brutality.model.players.packets.commands.all;

import org.brutality.Server;
import org.brutality.model.content.Unspawnable;
import org.brutality.model.items.ItemDefinition;
import org.brutality.model.players.Player;
import org.brutality.model.players.packets.commands.Command;
import org.brutality.util.Misc;

/**
 * Puts a given amount of the item in the player's inventory.
 * 
 * @author Emiel
 */
public class Item implements Command {

	@Override
	public void execute(Player c, String input) {
		String[] args = input.split(" ");
		try {
			int itemId = Integer.parseInt(args[0]);
			int amount = Misc.stringToInt(args[1]);
			if (Server.getMultiplayerSessionListener().inAnySession(c)) {
				return;
			}
			if (c.inWild() || c.inCamWild()) {
				c.sendMessage("You Cannot Spawn In The Wilderness!");
				
				return;
			}
			if(itemId >= 2677 && itemId <= 3000 || itemId >= 19400 && itemId <= 19700 || itemId >= 11818 && itemId <= 11822 || itemId == 604 && itemId == 773) {
				c.sendMessage("This item is not spawnable.");
				return;
			}
			if (itemId == 604 ||itemId == 6915 || itemId == 15041 || itemId == 15036 || itemId == 15037) {
				c.sendMessage("This item is not spawnable");
				return;
			}
			if(c.underAttackBy > 0 || c.underAttackBy2 > 0) {
				c.sendMessage("You can't do this whilst in combat!");
				return;
			}
			if (c.ironman){
				c.sendMessage("You Cannot Spawn As an Ironman!");
				return;
			}
			Unspawnable.spawnItem(c, itemId, amount);
		} catch (NumberFormatException nfe) {
			c.sendMessage("Improper use of the command; '::item itemid amount'.");
		}
	}
}
