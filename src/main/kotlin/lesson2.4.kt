fun main (){
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 0.2
    val crystalBuff = (crystalOre * buffPercent).toInt()
    val ironBuff = (ironOre * buffPercent).toInt()
    println("""
        |Кристалов получено: $crystalOre
        |Бонусные кристаллы: $crystalBuff
        |Железо получено: $ironOre
        |Бонусное железо: $ironBuff
    """.trimMargin())
}