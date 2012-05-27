package Lappy.AdminsCanFly;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class AdminsCanFly extends JavaPlugin {
    public static final Logger log = Logger.getLogger("Minecraft");
    private final PlyListener eventListener = new PlyListener();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(eventListener, this);
        log.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                if (record.getMessage() != null) {
                    if (record.getMessage().toLowerCase().contains("was kicked for floating too long!")) {
                        return false;
                    }
                }
                return true;
            }
        });
    }
}

/* Location:           C:\Users\cnaude\Downloads\AdminsCanFly.jar
 * Qualified Name:     Lappy.AdminsCanFly.AdminsCanFly
 * JD-Core Version:    0.6.0
 */