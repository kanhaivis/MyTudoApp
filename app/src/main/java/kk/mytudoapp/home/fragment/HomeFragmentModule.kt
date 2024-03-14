package kk.mytudoapp.home.fragment

import dagger.Module
import dagger.Provides
import kk.mytudoapp.home.HomeAdapter

@Module
class HomeFragmentModule {

    @Provides
    fun provideHomeAdapter() : HomeAdapter {
        return HomeAdapter(listOf())
    }


}