package com.tacuchi.lets_meet.presentation.meetings.presenter

import com.tacuchi.lets_meet.domain.entity.Meeting
import com.tacuchi.lets_meet.presentation.meetings.MeetingsContract
import javax.inject.Inject

class MeetingsPresenter @Inject constructor(
    private val interactor: MeetingsContract.Interactor
) : MeetingsContract.Presenter {

    override fun attachView(view: MeetingsContract.View) {
        TODO("Not yet implemented")
    }

    override fun saveMeeting(meeting: Meeting) {
        TODO("Not yet implemented")
    }

    override fun updateMeeting(meeting: Meeting) {
        TODO("Not yet implemented")
    }

    override fun getMeetings() {
        TODO("Not yet implemented")
    }
}