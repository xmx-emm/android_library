package online.mx.android.library.utils


fun String.clampDecimalPlaces(places: Int): String {
    val sp = split(".")
    return if (sp.size == 2) "${sp[0]}.${sp[1].take(places)}"
    else this
}
