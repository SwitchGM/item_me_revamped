package org.bundle_me.item_me_revamped;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class ItemMePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Enabled ItemMeRevamped");
    }
}
