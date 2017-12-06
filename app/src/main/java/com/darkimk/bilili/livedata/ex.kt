package com.darkimk.bilili.livedata

import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

inline fun <T, R : ObservableBean> R.ob(v: T): ReadWriteProperty<Any?, T> =
        object : ObservableProperty<T>(v) {
            override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
                onPropertyChange()
            }
        }