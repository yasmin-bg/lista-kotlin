fun ultimoElemento(lista: List<Int>): Int {
    return lista.last();
}

fun main() {
    val resultado = ultimoElemento(listOf(1, 1, 2, 3, 5, 8))
    println(resultado)
}