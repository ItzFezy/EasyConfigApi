package plugins.easyconfigapi.API;

import org.bukkit.plugin.Plugin;

public class ECA {
    private static Plugin plugin;
    public static void setPlugin(Plugin plugin){
        ECA.plugin = plugin;
    }

    public static Plugin getPlugin(){
        if (plugin != null) {return plugin;} else {return null;}
    }
}
