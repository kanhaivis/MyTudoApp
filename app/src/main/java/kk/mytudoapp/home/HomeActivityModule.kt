package kk.mytudoapp.home

import androidx.recyclerview.widget.LinearLayoutManager
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    fun provideHomeAdapter() : HomeAdapter{
        return HomeAdapter(listOf())
    }


}