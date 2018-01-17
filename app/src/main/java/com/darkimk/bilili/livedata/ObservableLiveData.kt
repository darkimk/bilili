package com.darkimk.bilili.livedata

import android.arch.lifecycle.MutableLiveData

class ObservableLiveData<T : ObservableBean> : MutableLiveData<T>(), OnPropertyChangeListener {

    override fun setValue(value: T?) {
        if (value?.listenter == null) value?.listenter = this
        super.setValue(value)
    }

    override fun onChange() {
        value = value
    }
}