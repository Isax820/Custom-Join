package org.customjoin.customJoin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.util.Ticks;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinListener implements Listener {

    private final CustomJoin plugin;
    private final MiniMessage miniMessage;

    public JoinListener(CustomJoin plugin) {
        this.plugin = plugin;
        this.miniMessage = MiniMessage.miniMessage();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        FileConfiguration config = plugin.getConfig();

        // Join message
        String joinMessage = config.getString("join-message");
        if (joinMessage != null && !joinMessage.isEmpty()) {
            joinMessage = joinMessage.replace("%player%", event.getPlayer().getName());
            Component component = miniMessage.deserialize(joinMessage);
            event.joinMessage(component);
        }

        // Title
        if (config.getBoolean("title-on-join")) {

            String main = config.getString("title.main", "")
                    .replace("%player%", event.getPlayer().getName());

            String sub = config.getString("title.sub", "");

            int fadeIn = config.getInt("title-times.fade-in", 10);
            int stay = config.getInt("title-times.stay", 70);
            int fadeOut = config.getInt("title-times.fade-out", 20);

            Title title = Title.title(
                    miniMessage.deserialize(main),
                    miniMessage.deserialize(sub),
                    Title.Times.times(
                            Ticks.duration(fadeIn),
                            Ticks.duration(stay),
                            Ticks.duration(fadeOut)
                    )
            );

            event.getPlayer().showTitle(title);
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        FileConfiguration config = plugin.getConfig();

        String leaveMessage = config.getString("leave-message");
        if (leaveMessage != null && !leaveMessage.isEmpty()) {
            leaveMessage = leaveMessage.replace("%player%", event.getPlayer().getName());
            Component component = miniMessage.deserialize(leaveMessage);
            event.quitMessage(component);
        }
    }
}