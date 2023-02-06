package jp.thirtycraft.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class message implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        //コマンドを、送信した人にメッセージ
        sender.sendMessage("よく見つけたね");
        //全体送信
        Bukkit.broadcastMessage("誰かが探し終わってしまった");

        return true;

    }
}

