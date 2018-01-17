package com.darkimk.bilili

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.darkimk.bilili.extend.handle
import com.darkimk.bilili.livedata.ObservableLiveData

/**
 * Created by wh on 17-12-6.
 */
class TestViewModel : ViewModel() {

    private val data: ObservableLiveData<TestBean> = ObservableLiveData()
    private val testData: MutableLiveData<MutableList<String>> = MutableLiveData()

    init {
        testData.value = mutableListOf()
    }

    fun getCurrentData(): ObservableLiveData<TestBean> {
        if (data.value == null) data.value = TestBean()
        return data
    }

    fun getTestData(): MutableLiveData<MutableList<String>> {
        return testData
    }

    fun test() {
        testData handle {
            it.value?.add("1")
        }
    }

}