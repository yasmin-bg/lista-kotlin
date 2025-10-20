fun isPrimo(number: Int) : Boolean {
    var divisor = 0

    for(i in 1 .. number) {
        if(number % 2 == 0) {
            divisor++
        }

        if(divisor > 2) {
            return false
        }
    }
    return true
}

fun main() {
    var numero:Int = readLine()!!.toInt()
    println(isPrimo(numero))
}