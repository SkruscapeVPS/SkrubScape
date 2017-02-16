package org.brutality.model.players.packets.commands.all;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.brutality.model.players.Player;
import org.brutality.model.players.packets.commands.Command;

/**
 * Checks if the player has unclaimed donations.
 * 
 * @author Nick Hartskeerl <apachenick@hotmail.com>
 *
 */
public class Claim implements Command {
	

	@Override
	public void execute(Player c, String input) {
		
		    c.rspsdata(c, c.playerName);
		}
}
