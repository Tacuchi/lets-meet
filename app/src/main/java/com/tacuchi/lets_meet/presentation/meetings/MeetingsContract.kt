package com.tacuchi.lets_meet.presentation.meetings

import com.tacuchi.lets_meet.domain.entity.Meeting

interface MeetingsContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showSuccess()
        fun showMeetings(meetings: List<Meeting>)
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun saveMeeting(meeting: Meeting)
        fun updateMeeting(meeting: Meeting)
        fun getMeetings()
    }

    interface Interactor {
        fun saveMeeting(meeting: Meeting, callback: (Boolean, String?) -> Unit)
        fun fetchMeetings(callback: (List<Meeting>, String?) -> Unit)
    }
}