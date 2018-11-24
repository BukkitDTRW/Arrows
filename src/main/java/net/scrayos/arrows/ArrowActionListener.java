package net.scrayos.arrows;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class ArrowActionListener implements Listener {

    @EventHandler
    public void onExplosiveArrow(final ProjectileHitEvent e) {
        // check if projectile is arrow
        if (e.getEntity().getType() != EntityType.ARROW) return;

        // check if shooter is player
        if (!(e.getEntity().getShooter() instanceof Player)) return;

        // create explosion at point of impact
        Location loc = e.getEntity().getLocation();

        //loc.getWorld().createExplosion(loc, 8);
        loc.getWorld().spawnEntity(loc, EntityType.HORSE);

        new BukkitRunnable() {
            @Override
            public void run() {
                e.getEntity().remove();
            }
        }.runTask(Arrows.getInstance());
    }
}
