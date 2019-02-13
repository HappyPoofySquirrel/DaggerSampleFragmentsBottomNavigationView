package com.example.guyverhopkins.bottomnavigationviewsample.core.network;

import com.example.guyverhopkins.bottomnavigationviewsample.core.app.AppModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * TODO Create class header 1/27/17.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

//    Retrofit retrofit();
}
