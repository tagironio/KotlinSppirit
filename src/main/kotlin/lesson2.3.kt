fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val departureTime = departureHours * 60 + departureMinutes
    val travelTime = 457
    val travelHours = travelTime / 60
    val travelMinutes = travelTime % 60
    val arrivalTime = travelTime + departureTime
    val arrivalHours = arrivalTime / 60
    val arrivalMinutes = arrivalTime % 60

    println("""
        |Время выезда: $departureHours:$departureMinutes
        |Время в пути: $travelHours:$travelMinutes
        |Время прибытия: $arrivalHours:$arrivalMinutes
    """.trimMargin())
}   