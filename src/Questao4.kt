fun encode() {
    val lista = "aaaabccaadeeee".toList()
    var contador = 1
    var palavraAtual = lista[0]

    for (i in 1 until lista.size) {
        if (lista[i] == palavraAtual) {
            contador++
        } else {
            println("($contador, $palavraAtual)")
            palavraAtual = lista[i]
            contador = 1
        }
    }

    println("($contador, $palavraAtual)")
}

fun main() {
    encode()
}