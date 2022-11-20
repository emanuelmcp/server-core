package io.github.emanuelmcp;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import io.github.emanuelmcp.api.injector.BinderModule;
import io.github.emanuelmcp.api.injector.CommandInitializer;
import io.github.emanuelmcp.models.Database;
import io.github.emanuelmcp.api.injector.ListenerIntializer;
import org.bukkit.plugin.java.JavaPlugin;


public class ServerCore extends JavaPlugin {
    @Inject private ListenerIntializer listenerIntializer;
    @Inject private CommandInitializer commandInitializer;
    @Inject Database db;
    @Override
    public void onEnable() {
        //Startup logic plugin

    }

    @Override
    public void onLoad() {
        super.onLoad();
        final Injector injector = Guice.createInjector(new BinderModule(this));
        injector.injectMembers(this);
        listenerIntializer.init(injector);
        commandInitializer.init(injector);
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
    }

    @Override
    public void onDisable() {
        //End logic pluginç
        db.write();
        //db.read();
    }
}
