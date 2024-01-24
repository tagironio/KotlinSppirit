fun main(){
    val gagarinSeconds = 6489

    val hours = gagarinSeconds / 3600
    val minutes = (gagarinSeconds % 3600) / 60
    val seconds = gagarinSeconds % 60

    val formatTime = String.format("%02d:%02d:%02d", hours, minutes, seconds )
    println(formatTime)
}