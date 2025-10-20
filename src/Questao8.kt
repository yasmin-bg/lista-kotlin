fun intervaloDePrimo(number1: Int, number2: Int): List<Int> {
    val lista = mutableListOf<Int>()

    for (i in number1..number2) {
        var divisor = 0
        for (j in 1..i) {
            if (i % j == 0) {
                divisor++
            }
        }
        if (divisor == 2) {
            lista.add(i)
        }
    }

    return lista
}

fun main() {
    var numero1:Int = readLine()!!.toInt()
    var numero2:Int = readLine()!!.toInt()
    println(intervaloDePrimo(numero1, numero2))
}