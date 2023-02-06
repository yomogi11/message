package jp.thirtycraft.pulgin;

import jp.thirtycraft.Commands.message;
import org.bukkit.plugin.java.JavaPlugin;

public final class Pulgin extends JavaPlugin {
    private static JavaPlugin pluguin;

    @Override
    public void onEnable() {
        //プラグインが、起動しました
        super.onEnable();

        getCommand("message").setExecutor(new message());
    }

    @Override
    public void onDisable() {
        //プラグインが、停止しましたPlugin shutdown logic
        super.onDisable();
    }
    public static JavaPlugin getPlugin() {return pluguin;}
}
