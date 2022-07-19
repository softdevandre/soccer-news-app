package me.dio.soccernews;

import android.app.Application;

// TODO Substituir esta instância (por ser anti-pattern) por alguma solução de injeção de dependência (como o Dagger ou o Hilt)
public class App extends Application {

    private static App instance;

    public static App getInstance() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
