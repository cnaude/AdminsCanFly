package Lappy.AdminsCanFly;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class PlyListener implements Listener {

    @EventHandler
    public void onPlayerKick(PlayerKickEvent event) {
        String reason = event.getReason();
        Player player = event.getPlayer();
        if (player.hasPermission("adminscanfly.allow")) {
            if ((reason.toLowerCase().contains("flying")) || (reason.toLowerCase().contains("floating"))) {
                event.setCancelled(true);
            }
        }
    }
}

/* Location:           C:\Users\cnaude\Downloads\AdminsCanFly.jar
 * Qualified Name:     Lappy.AdminsCanFly.PlyListener
 * JD-Core Version:    0.6.0
 */