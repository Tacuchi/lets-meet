package com.tacuchi.lets_meet.presentation.home.interactor

import com.tacuchi.lets_meet.domain.entity.Contact
import com.tacuchi.lets_meet.domain.entity.Meeting
import com.tacuchi.lets_meet.presentation.home.HomeContract
import javax.inject.Inject

class HomeInteractor @Inject constructor(

) : HomeContract.Interactor {

    override fun fetchUpcomingMeetings(callback: (List<Meeting>, String?) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun fetchContacts(callback: (List<Contact>, String?) -> Unit) {
        TODO("Not yet implemented")
    }
}