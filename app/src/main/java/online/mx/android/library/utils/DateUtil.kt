package online.mx.android.library.utils

import android.annotation.SuppressLint
import java.sql.Timestamp
import java.text.SimpleDateFormat

/**
 * 时间戳转年月日
 * 2024-07-03
 */
val Timestamp.ymd: String
    @SuppressLint("SimpleDateFormat")
    get() {
        return SimpleDateFormat("yyyy-MM-dd").format(time)
    }

/**
 * 确定一月多少天
 *
 * @param year
 * @param month
 * @return
 */
fun getMonthOfDay(year: Int, month: Int): Int {
    val day: Int = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 29 else 28

    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> return 31
        4, 6, 9, 11 -> return 30
        2 -> return day
    }
    return 0
}
