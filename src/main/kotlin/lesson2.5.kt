fun main (){
    val deposit = 70000
    val percentRate = 16.7/100
    val years = 20

    val result = deposit * Math.pow(1 + percentRate, years.toDouble())

    println("Размер вклада через 20 лет: %.3f".format(result))
}