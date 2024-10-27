package com.tacuchi.lets_meet.presentation.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tacuchi.lets_meet.databinding.FragmentHomeBinding
import com.tacuchi.lets_meet.domain.entity.Contact
import com.tacuchi.lets_meet.domain.entity.Meeting
import com.tacuchi.lets_meet.presentation.home.HomeContract
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(), HomeContract.View {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        textView.text = "This is home fragment"

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun showUpcomingMeetings(meetings: List<Meeting>) {
        TODO("Not yet implemented")
    }

    override fun showContacts(contacts: List<Contact>) {
        TODO("Not yet implemented")
    }

    override fun showError() {
        TODO("Not yet implemented")
    }
}