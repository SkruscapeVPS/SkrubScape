package org.brutality.model.players;

/**
 * Packet interface.
 * 
 * @author Graham
 * 
 */
public interface Packet {

	public void handlePacket(Player client, int packetType, int packetSize);

}
