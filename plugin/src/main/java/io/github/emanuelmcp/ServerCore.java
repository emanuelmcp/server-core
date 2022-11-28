package io.github.emanuelmcp;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import io.github.emanuelmcp.api.BinderModule;
import io.github.emanuelmcp.api.initializers.CommandInitializer;
import io.github.emanuelmcp.api.initializers.ListenerIntializer;
import org.bukkit.plugin.java.JavaPlugin;


public class ServerCore extends JavaPlugin {
    @Inject
    private ListenerIntializer listenerIntializer;
    @Inject
    private CommandInitializer commandInitializer;

    @Override
    public void onEnable() {

    }

    @Override
    public void onLoad() {
        super.onLoad();
        final Injector injector = Guice.createInjector(new BinderModule(this));
        injector.injectMembers(this);
        listenerIntializer.init(injector);
        commandInitializer.init(injector);
    }

    @Override
    public void onDisable() {
        //End logic pluginç

    }
}
