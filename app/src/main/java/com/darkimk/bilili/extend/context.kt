package com.darkimk.bilili.extend

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

/**
 * @author DarkWH
 * @date 2017/12/25
 * @description 对Context的一些扩展
 */

/**
 * 获取颜色int(具备兼容性)
 */
fun Context.getCompatColor(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)