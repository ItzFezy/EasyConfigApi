package plugins.easyconfigapi.API;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import plugins.easyconfigapi.Configs.EasyConfig;

import java.io.IOException;

public class ECA {
    private static Plugin plugin;
    public static void setPlugin(Plugin plugin){
        ECA.plugin = plugin;
    }

    public static Plugin getPlugin(){
        if (plugin != null) {return plugin;} else {return null;}
    }
}
