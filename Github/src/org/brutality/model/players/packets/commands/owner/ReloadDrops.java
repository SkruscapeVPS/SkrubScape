package org.brutality.model.players.packets.commands.owner;

import org.brutality.model.players.Player;
import org.brutality.model.players.packets.commands.Command;
import org.brutality.util.json.NpcDropCacheLoader;
import org.brutality.util.json.NpcDropTableLoader;

/**
 * Start the update timer and update the server.
 * 
 * @author Emiel
 *
 */
public class ReloadDrops implements Command {

	@Override
	public void execute(Player c, String input) {
		new NpcDropTableLoader().load(); 
		c.sendMessage("Reloading Drops!");		
}
	}
	
