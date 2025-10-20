fun isPalindrome(lista: List<Int>): Boolean {
    return lista == lista.reversed()
}

fun main() {
    val resultado = isPalindrome(listOf(1, 2, 3, 2, 1))
    println(resultado)
}