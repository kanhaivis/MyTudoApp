package kk.mytudoapp.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import kk.mytudoapp.R
import kk.mytudoapp.home.HomeActivity
import kk.mytudoapp.login.mvvm.LoginViewModel
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login_activity)


        /*viewModel = ViewModelProvider(this)[LoginViewModel::class.java]*/

        viewModel.getLoginStatus.observe(this){
            println("Login status $it")
            if (it ==  "success") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun onSubmit(view: View) {
        viewModel.getCheckUserPassword("kanhai","kanhai1233")
    }
}