fun main (){
    val workers = 50
    val wagesOfWorker = 30000
    val trainees = 30
    val wagesOfTrainee = 20000
    val allWorkers = workers + trainees

    val wagesOfWorkers = workers * wagesOfWorker
    val allExpenses = wagesOfWorkers + (trainees * wagesOfTrainee)
    val averageWages = allExpenses / allWorkers

    println("""
        |Расходы на выплату зарплаты постоянных сотрудников: $wagesOfWorkers
        |Общие расходы по ЗП: $allExpenses
        |Средняя зарплата одного сотрудника: $averageWages
    """.trimMargin())

}