package im.hunnybon.ihgm;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.scheduler.BukkitRunnable;

public class Task extends BukkitRunnable {
    @Override
    public void run(){
        if (Bukkit.getOnlinePlayers().size() == 0) {
            if (Boolean.TRUE.equals(Bukkit.getWorlds().get(0).getGameRuleValue(GameRule.DO_DAYLIGHT_CYCLE))) {
                Bukkit.getWorlds().get(0).setFullTime(Bukkit.getWorlds().get(0).getFullTime() - 1);
            }
        }
    }
}
