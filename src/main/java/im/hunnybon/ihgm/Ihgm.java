package im.hunnybon.ihgm;

import org.bukkit.plugin.java.JavaPlugin;

public final class Ihgm extends JavaPlugin {

    @Override
    public void onEnable() {
        Task task = new Task();
        task.runTaskTimer(this, 0, 1);
    }
}
