package com.tacuchi.lets_meet.presentation.login.view

import android.content.Intent
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.tacuchi.lets_meet.R
import com.tacuchi.lets_meet.databinding.ActivityLoginBinding
import com.tacuchi.lets_meet.domain.entity.User
import com.tacuchi.lets_meet.presentation.login.LoginContract
import com.tacuchi.lets_meet.presentation.main.view.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var binding: ActivityLoginBinding

    @Inject
    lateinit var presenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            binding.login.visibility = View.VISIBLE
            presenter.login(binding.username.text.toString(), binding.password.text.toString())
        }
    }

    private fun updateUiWithUser(model: User) {
        val welcome = getString(R.string.welcome)
        val displayName = model.name
        // TODO : initiate successful logged in experience
        Toast.makeText(
            applicationContext,
            "$welcome $displayName",
            Toast.LENGTH_LONG
        ).show()
    }

    private fun showLoginFailed(@StringRes errorString: Int) {
        Toast.makeText(applicationContext, errorString, Toast.LENGTH_SHORT).show()
    }

    override fun showLoginError(message: String) {
        binding.loading.visibility = View.GONE
        showLoginFailed(R.string.login_failed)
    }

    override fun navigateToHome(user: User) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun navigateToRegister() {
        TODO("Not yet implemented")
    }
}