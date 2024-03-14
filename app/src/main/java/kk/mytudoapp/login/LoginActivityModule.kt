package kk.mytudoapp.login


import dagger.Module
import dagger.Provides
import kk.mytudoapp.home.HomeAdapter

@Module
class LoginActivityModule {


    @Provides
    fun provideHomeAdapter() : HomeAdapter {
        return HomeAdapter(listOf())
    }

}