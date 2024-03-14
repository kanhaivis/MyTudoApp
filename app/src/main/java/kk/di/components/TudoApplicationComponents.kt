package kk.di.components

import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import kk.TudoApplication
import kk.di.module.ActivityBindingModule
import kk.mytudoapp.login.mvvm.LoginViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ActivityBindingModule::class, AndroidSupportInjectionModule::class, LoginViewModelModule::class]
)
interface TudoApplicationComponents {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TudoApplication): Builder
        fun build(): TudoApplicationComponents
    }

    fun inject(todoApplication: TudoApplication)
}