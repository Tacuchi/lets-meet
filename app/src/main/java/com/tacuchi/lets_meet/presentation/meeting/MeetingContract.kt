package com.tacuchi.lets_meet.presentation.meeting

import com.tacuchi.lets_meet.domain.entity.Meeting

interface MeetingContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showSuccess()
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun saveMeeting(meeting: Meeting)
        fun updateMeeting(meeting: Meeting)
    }

    interface Interactor {
        fun saveMeeting(meeting: Meeting, callback: (Boolean, String?) -> Unit)
    }
}