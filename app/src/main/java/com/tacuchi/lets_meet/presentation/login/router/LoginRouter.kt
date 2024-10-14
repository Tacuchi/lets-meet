package com.tacuchi.lets_meet.presentation.login.router

import com.tacuchi.lets_meet.domain.entity.User
import com.tacuchi.lets_meet.presentation.login.LoginContract
import com.tacuchi.lets_meet.presentation.login.view.ui.login.LoginActivity
import javax.inject.Inject

class LoginRouter @Inject constructor(): LoginContract.Router {

    private lateinit var activity: LoginActivity

    override fun attachActivity(activity: LoginActivity) {
        this.activity = activity
    }

    override fun navigateToHome(user: User) {
//        val intent = Intent(activity, HomeActivity::class.java)
//        intent.putExtra("user", user)
//        activity.startActivity(intent)
//        activity.finish()

    }

    override fun navigateToRegister() {
//        val intent = Intent(activity, RegisterActivity::class.java)
//        activity.startActivity(intent)
    }
}