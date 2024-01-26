fun main(){
    val number: Int = 7
    var count: Int = 0
    println("""
        |$number x ${++count} = ${number * 1}
        |$number x ${++count} = ${number * 2}
        |$number x ${++count} = ${number * 3}
        |$number x ${++count} = ${number * 4}
        |$number x ${++count} = ${number * 5}
        |$number x ${++count} = ${number * 6}
        |$number x ${++count} = ${number * 7}
        |$number x ${++count} = ${number * 8}
        |$number x ${++count} = ${number * 9}
    """.trimMargin())

}

