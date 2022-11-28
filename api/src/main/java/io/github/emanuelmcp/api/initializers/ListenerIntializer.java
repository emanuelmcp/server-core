package io.github.emanuelmcp.api.initializers;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class ListenerIntializer implements Initializer {

    private final JavaPlugin javaPlugin;
    private final PluginManager pluginManager;

    @Inject
    public ListenerIntializer(JavaPlugin javaPlugin, PluginManager pluginManager) {
        this.javaPlugin = javaPlugin;
        this.pluginManager = pluginManager;
    }

    @Override
    public void init(@NotNull Injector injector) {
    }
}
