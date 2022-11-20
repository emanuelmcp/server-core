package io.github.emanuelmcp.api.injector;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class CommandInitializer implements Initializer {

    @Inject
    private JavaPlugin javaPlugin;

    @Override
    public void init(@NotNull Injector injector) {
    }
}
