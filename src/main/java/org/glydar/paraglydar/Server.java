package org.glydar.paraglydar;

import java.util.Collection;
import java.util.logging.Logger;

import org.glydar.paraglydar.event.manager.EventManager;
import org.glydar.paraglydar.models.Entity;
import org.glydar.paraglydar.models.Player;
import org.glydar.paraglydar.permissions.Permission;

public interface Server {

	EventManager getEventManager();

	public Collection<Player> getConnectedPlayers();
	
	public Collection<Entity> getConnectedEntities();
	
	public Entity getEntityByEntityID(long id);
	
	public Player getPlayerByEntityID(long id);

	public Logger getLogger();

	public boolean isRunning();

    public void shutdown();
    
    public void broadcastMessage(String message);
    
    public void broadcast(String message, String permission);

    public void broadcast(String message, Permission permission);
}