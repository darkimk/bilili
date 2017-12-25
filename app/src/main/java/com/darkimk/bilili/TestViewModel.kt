package com.darkimk.bilili

import android.arch.lifecycle.ViewModel
import com.darkimk.bilili.livedata.ObservableLiveData

/**
 * Created by wh on 17-12-6.
 */
class TestViewModel : ViewModel() {

    private val data = ObservableLiveData<TestBean>()

    fun getCurrentData(): ObservableLiveData<TestBean> {
        if (data.value == null) data.value = TestBean()
        return data
    }

}