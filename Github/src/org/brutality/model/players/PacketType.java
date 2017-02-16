package org.brutality.model.players;

import org.brutality.net.Packet;

public interface PacketType {
	public void processPacket(Player c, Packet packet);
}
