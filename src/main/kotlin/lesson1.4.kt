fun main(){
    val length: Long = 40_868_600_000
    val age: Int = 27
    val partOfDay: Float = 0.075F
    val seconds: Int = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000
    println("""
        |Расстояние: $length
        |Возраст: $age
        |Часть дня: $partOfDay
        |Секунды: $seconds
        |Часть года: $partOfYear
        |Апогей орбиты: $apogee
    """.trimMargin())
}