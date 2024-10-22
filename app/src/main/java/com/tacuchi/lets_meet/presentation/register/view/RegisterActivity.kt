package com.tacuchi.lets_meet.presentation.register.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tacuchi.lets_meet.R
import com.tacuchi.lets_meet.databinding.ActivityRegisterBinding
import com.tacuchi.lets_meet.presentation.main.view.MainActivity
import com.tacuchi.lets_meet.presentation.register.RegisterContract
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity(), RegisterContract.View {

    private lateinit var binding: ActivityRegisterBinding

    @Inject
    lateinit var presenter: RegisterContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.attachView(this)

        binding.register.setOnClickListener {
            presenter.register(
                binding.username.text.toString(),
                binding.password.text.toString()
            )
        }
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showSuccess() {
    }

    override fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun showError() {
    }
}