package com.tacuchi.lets_meet.presentation.settings

import com.tacuchi.lets_meet.domain.entity.Settings

interface SettingsContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showSettings(settings: Settings)
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun fetchSettings(settings: Settings)
        fun updateSettings(settings: Settings)
    }

    interface Interactor {
        fun fetchSettings(callback: (Settings) -> Unit)
        fun updateSettings(settings: Settings, callback: (Settings?, String?) -> Unit)
    }
}