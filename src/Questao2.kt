fun penultimoElemento(lista: List<Int>): Int {
    return lista[lista.size - 2]
}

fun main() {
    val resultado = penultimoElemento(listOf(1, 1, 2, 3, 5, 8))
    println(resultado)
}