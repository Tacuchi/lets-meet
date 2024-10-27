package com.tacuchi.lets_meet.presentation.meetings.interactor

import com.tacuchi.lets_meet.domain.entity.Meeting
import com.tacuchi.lets_meet.presentation.meetings.MeetingsContract
import javax.inject.Inject

class MeetingsInteractor @Inject constructor(
) : MeetingsContract.Interactor {

    override fun saveMeeting(meeting: Meeting, callback: (Boolean, String?) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun fetchMeetings(callback: (List<Meeting>, String?) -> Unit) {
        TODO("Not yet implemented")
    }
}