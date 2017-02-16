package org.brutality.model.players.packets.commands;

import org.brutality.model.players.Player;

public interface Command {
	
	public void execute(Player c, String input);

}
