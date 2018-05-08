package com.example.dagger2;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by chandan kumar on 06/04/18.
 */

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
