package com.tacuchi.lets_meet.presentation.settings.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.tacuchi.lets_meet.R
import com.tacuchi.lets_meet.domain.entity.Settings
import com.tacuchi.lets_meet.presentation.settings.SettingsContract
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : PreferenceFragmentCompat(), SettingsContract.View {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun showSettings(settings: Settings) {
        TODO("Not yet implemented")
    }

    override fun showError() {
        TODO("Not yet implemented")
    }
}