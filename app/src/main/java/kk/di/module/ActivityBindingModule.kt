package kk.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kk.mytudoapp.home.HomeActivity
import kk.mytudoapp.home.HomeActivityModule
import kk.mytudoapp.home.fragment.HomeFragment
import kk.mytudoapp.home.fragment.HomeFragmentModule
import kk.mytudoapp.login.LoginActivity
import kk.mytudoapp.login.LoginActivityModule
import kk.mytudoapp.product.ProductActivity
import kk.mytudoapp.product.ProductActivityModule

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    abstract fun bindingLoginActivity() : LoginActivity

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindingHomeActivity() : HomeActivity

    @ContributesAndroidInjector(modules = [ProductActivityModule::class])
    abstract fun bindingProductActivity() : ProductActivity

    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindingHomeFragment() : HomeFragment
}