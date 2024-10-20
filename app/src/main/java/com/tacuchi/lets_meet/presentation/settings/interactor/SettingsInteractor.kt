package com.tacuchi.lets_meet.presentation.settings.interactor

import com.tacuchi.lets_meet.domain.entity.Settings
import com.tacuchi.lets_meet.presentation.settings.SettingsContract
import javax.inject.Inject

class SettingsInteractor @Inject constructor(
) : SettingsContract.Interactor {
    override fun fetchSettings(callback: (Settings) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun updateSettings(settings: Settings, callback: (Settings?, String?) -> Unit) {
        TODO("Not yet implemented")
    }
}