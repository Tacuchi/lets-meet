package com.tacuchi.lets_meet.presentation.main.router

import android.content.Intent
import com.tacuchi.lets_meet.presentation.login.view.ui.login.LoginActivity
import com.tacuchi.lets_meet.presentation.main.MainContract
import com.tacuchi.lets_meet.presentation.main.view.MainActivity
import javax.inject.Inject

class MainRouter @Inject constructor(): MainContract.Router {

    private lateinit var activity: MainActivity

    override fun attachActivity(activity: MainActivity) {
        this.activity = activity
    }

    override fun navigateToLogin() {
        val intent = Intent(activity, LoginActivity::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
}