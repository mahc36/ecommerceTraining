@file:JvmName("UtilityKt")
package com.training.ecommerce.util

@JvmOverloads
fun addEndingName(name: String, end: String? = "") : String {
    return name ending end
}

infix fun String.ending(ending: String?): String {
    return this.plus(ending)
}
