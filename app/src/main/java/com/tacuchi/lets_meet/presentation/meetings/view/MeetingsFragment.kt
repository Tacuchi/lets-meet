package com.tacuchi.lets_meet.presentation.meetings.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tacuchi.lets_meet.R
import com.tacuchi.lets_meet.databinding.FragmentMeetingsBinding
import com.tacuchi.lets_meet.domain.entity.Meeting
import com.tacuchi.lets_meet.presentation.meetings.MeetingsContract
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MeetingsFragment : Fragment(), MeetingsContract.View {

    private var _binding: FragmentMeetingsBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMeetingsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MeetingsFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun showSuccess() {
        TODO("Not yet implemented")
    }

    override fun showMeetings(meetings: List<Meeting>) {
        TODO("Not yet implemented")
    }

    override fun showError() {
        TODO("Not yet implemented")
    }
}