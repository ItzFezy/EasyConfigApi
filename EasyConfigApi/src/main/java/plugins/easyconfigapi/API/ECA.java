package plugins.easyconfigapi.API;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import plugins.easyconfigapi.Configs.EasyConfig;

public class ECA {
    @Getter
    public static Plugin plugin;
    public static void setPlugin(Plugin plugin){
        ECA.plugin = plugin;
    }
}
