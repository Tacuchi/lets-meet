package com.tacuchi.lets_meet.presentation.home

import com.tacuchi.lets_meet.domain.entity.Contact
import com.tacuchi.lets_meet.domain.entity.Meeting

interface HomeContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showUpcomingMeetings(meetings: List<Meeting>)
        fun showContacts(contacts: List<Contact>)
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun getUpcomingMeetings()
        fun getContacts()
    }

    interface Interactor {
        fun fetchUpcomingMeetings(callback: (List<Meeting>, String?) -> Unit)
        fun fetchContacts(callback: (List<Contact>, String?) -> Unit)
    }
}