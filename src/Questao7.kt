fun mdc(num1: Int, num2: Int): Int {
    var numero1 = num1
    var numero2 = num2

    while (numero2 != 0) {
        val temp = numero2
        numero2 = numero1 % numero2
        numero1 = temp
    }
    return numero1
}

fun main(){
    println(mdc(24, 36))
}