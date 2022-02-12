package org.example;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.console.command.CommandManager;
import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.permission.Permission;
import net.mamoe.mirai.console.permission.PermissionId;
import net.mamoe.mirai.console.permission.PermissionRegistryConflictException;
import net.mamoe.mirai.console.permission.PermissionService;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Myplugin extends JavaPlugin {
    private static Myplugin INSTANCE = new Myplugin();

    public Myplugin() {
        super(new JvmPluginDescriptionBuilder(
                "test.testPlugin",
                "1.0"
        ).build());
    }

    @Override
    //插件卸载
    public void onDisable() {
        System.out.println("插件卸载");

    }

    @Override
    //插件加载
    public void onEnable() {
        List<Bot> bots = Bot.getInstances();


    }



    @Override
    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {
        super.onLoad($this$onLoad);
    }
}
