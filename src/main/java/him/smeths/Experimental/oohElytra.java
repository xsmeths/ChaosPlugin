package him.smeths.Experimental;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class oohElytra implements Listener {
    @EventHandler
    public void onGlide(PlayerMoveEvent f) {
        Player player = f.getPlayer();
        if (player.getInventory().getChestplate() != null && player.getInventory().getChestplate().getType() == Material.ELYTRA) {
            player.setGliding(true);
        } else {
            player.setGliding(false);
        }
        if (player.isGliding()){
            player.getLocation().getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
            player.getLocation().getWorld().spawnEntity(player.getLocation().subtract(1.0,1.0, 1.0), EntityType.PRIMED_TNT);
            player.getLocation().getWorld().spawnEntity(player.getLocation().add(1.0,0.0, 1.0), EntityType.PRIMED_TNT);
        }
    }
}
