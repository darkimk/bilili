package com.darkimk.bilili.livedata

open class ObservableBean {

    var listenter: OnPropertyChangeListener? = null

    fun onPropertyChange() {
        listenter?.onChange()
    }

}