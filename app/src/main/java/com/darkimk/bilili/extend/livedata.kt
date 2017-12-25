package com.darkimk.bilili.extend

import com.darkimk.bilili.livedata.ObservableBean
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @author DarkWH
 * @date 2017/12/25
 * @description 对LiveData的一些扩展
 */
fun <T, R : ObservableBean> R.ob(v: T): ReadWriteProperty<Any?, T> =
        object : ObservableProperty<T>(v) {
            override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
                onPropertyChange()
            }
        }