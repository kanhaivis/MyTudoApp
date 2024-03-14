package kk.mytudoapp.product

import dagger.Module
import dagger.Provides

@Module
class ProductActivityModule {

    @Provides
    fun provideProductAdapter() : ProductAdapter {
        return ProductAdapter(listOf())
    }
}