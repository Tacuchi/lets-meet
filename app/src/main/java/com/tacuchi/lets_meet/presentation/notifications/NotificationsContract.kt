package com.tacuchi.lets_meet.presentation.notifications

import com.tacuchi.lets_meet.domain.entity.Notification

interface NotificationsContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showNotifications(notifications: List<Notification>)
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun fetchNotifications(notifications: List<Notification>)
    }

    interface Interactor {
        fun fetchNotifications(callback: (List<Notification>, String?) -> Unit)
    }
}