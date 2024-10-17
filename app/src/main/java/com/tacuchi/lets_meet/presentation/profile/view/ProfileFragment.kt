package com.tacuchi.lets_meet.presentation.profile.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.tacuchi.lets_meet.databinding.FragmentProfileBinding
import com.tacuchi.lets_meet.presentation.profile.ProfileContract
import com.tacuchi.lets_meet.presentation.settings.view.SettingsActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : Fragment(), ProfileContract.View {

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    @Inject
    lateinit var presenter: ProfileContract.Presenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textProfile
        textView.text = "This is profile Fragment"

        binding.btnSettings.setOnClickListener {
            val intent = Intent(activity, SettingsActivity::class.java)
            startActivity(intent)
        }

        presenter.attachView(this)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun showProfile(profile: String) {
        TODO("Not yet implemented")
    }
}