package com.darkimk.bilili.extend

import android.app.Activity

import com.tbruyelle.rxpermissions2.RxPermissions

import io.reactivex.Observable

/**
 * @author DarkWH
 * @date 2017/12/25
 * @description 对Activity的一些扩展
 */

/**
 * 申请权限
 *
 * @param permissions 需要申请的权限
 */
fun Activity.requestPermissions(vararg permissions: String): Observable<Boolean> {
    return RxPermissions(this).request(*permissions)
}

