fun main() {
    var fromSquare = "E2"
    var toSquare = "E4"
    var moveNumber = 1

    println("Ход игрока: [$fromSquare-$toSquare;$moveNumber]")

    fromSquare = "D2"
    toSquare = "D3"
    moveNumber++

    println("Следующий ход белых: [$fromSquare-$toSquare;$moveNumber]")
    val inputString = "D2-D4;0"
    val (a, b, c) = inputString.split('-', ';')
    println("""
        |Откуда: $a 
        |Куда: $b 
        |Номер хода: $c
    """.trimMargin())
}
