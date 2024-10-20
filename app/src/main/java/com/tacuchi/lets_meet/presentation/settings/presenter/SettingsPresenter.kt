package com.tacuchi.lets_meet.presentation.settings.presenter

import com.tacuchi.lets_meet.domain.entity.Settings
import com.tacuchi.lets_meet.presentation.settings.SettingsContract
import javax.inject.Inject

class SettingsPresenter @Inject constructor(
    private val interactor: SettingsContract.Interactor
) : SettingsContract.Presenter {

    private lateinit var view: SettingsContract.View

    override fun attachView(view: SettingsContract.View) {
        this.view = view
    }

    override fun fetchSettings(settings: Settings) {
        TODO("Not yet implemented")
    }

    override fun updateSettings(settings: Settings) {
        TODO("Not yet implemented")
    }
}