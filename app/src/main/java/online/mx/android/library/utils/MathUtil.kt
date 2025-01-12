package online.mx.android.library.utils

import kotlin.math.absoluteValue
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.min

/**
 * 浮点限制范围
 */
fun Float.range(maxFloat: Float, minValue: Float = 0F): Float {
    return min(max(minValue, this), maxFloat)
}

/**
 * 整数范围
 */
fun Int.range(maxInt: Int, minInt: Int = 0): Int {
    return min(max(minInt, this), maxInt)
}

/**
 * 是正数
 */
val Float.isPositive: Boolean
    get() {
        return this == absoluteValue
    }

/**
 * 是负数
 */
val Float.isNegative: Boolean
    get() {
        return this != absoluteValue
    }

/**
 * 是零
 */
val Float.isZero: Boolean
    get() {
        return this == 0F
    }

// 整数除法向上取整
fun divideAndCeil(dividend: Int, divisor: Int): Int {
    return ceil(dividend.toDouble() / divisor.toDouble()).toInt()
}

fun Int.floorMod(other: Int): Int = when (other) {
    0 -> this
    else -> this - floorDiv(other) * other
}

fun bytesToGB(bytes: Long): Double {
    val bytesInGB = 1024.0 * 1024.0 * 1024.0 // 1 GB = 1024 MB = 1024 KB = 1024 B
    return bytes / bytesInGB
}