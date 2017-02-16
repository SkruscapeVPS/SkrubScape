package org.brutality.model.players.packets.commands.owner;

import org.brutality.Server;
import org.brutality.event.CycleEventHandler;
import org.brutality.model.players.ConnectedFrom;
import org.brutality.model.players.Player;
import org.brutality.model.players.packets.commands.Command;



/**
 * Toggle the Cyber Monday sale on or off.
 * 
 * @author Emiel
 *
 */
public class Kickall implements Command {

	@Override
	public void execute(Player c, String input) {
			if (Server.getMultiplayerSessionListener().inAnySession(c)) {
				c.sendMessage("The player is in a trade, or duel. You cannot do this at this time.");
				return;
			}
			c.outStream.createFrame(109);
			CycleEventHandler.getSingleton().stopEvents(c);
			c.properLogout = true;
			ConnectedFrom.addConnectedFrom(c, c.connectedFrom);
			c.sendMessage("Kicked " + c.playerName);
		
}
	}
