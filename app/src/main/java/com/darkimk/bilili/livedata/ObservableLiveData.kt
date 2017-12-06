package com.darkimk.bilili.livedata

import android.arch.lifecycle.LiveData

class ObservableLiveData<T : ObservableBean> : LiveData<T>(), OnPropertyChangeListener {

    public override fun postValue(value: T?) {
        super.postValue(value)
    }

    public override fun setValue(value: T?) {
        if (value?.listenter == null) value?.listenter = this
        super.setValue(value)
    }

    override fun onChange() {
        value = value
    }
}