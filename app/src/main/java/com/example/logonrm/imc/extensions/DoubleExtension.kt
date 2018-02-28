package com.example.logonrm.imc.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
fun Double.format2(digits: Int) = String.format("%.${digits}f", this)