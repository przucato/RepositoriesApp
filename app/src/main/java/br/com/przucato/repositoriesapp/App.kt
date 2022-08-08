package br.com.przucato.repositoriesapp

import android.app.Application
import br.com.przucato.repositoriesapp.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
    }
}