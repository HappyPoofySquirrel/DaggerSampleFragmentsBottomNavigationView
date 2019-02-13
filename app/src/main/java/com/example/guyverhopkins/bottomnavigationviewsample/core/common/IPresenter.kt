package com.example.guyverhopkins.bottomnavigationviewsample.core.common

interface IPresenter<T> {
    fun attachView(view: T)

    fun detachView()
}