fun decode() {
    val lista = "aaaabccaadeeee".toList()
    var contador = 1
    var palavraAtual = lista[0]

    var listaComplementar: MutableList<String> = mutableListOf()
    var listaMutavel: MutableList<String> = mutableListOf()

    for (i in 1 until lista.size) {
        if (lista[i] == palavraAtual) {
            contador++
        } else {

            listaComplementar.add(palavraAtual.toString())
            listaComplementar.add(contador.toString())
            listaMutavel.add(listaComplementar.toString())

            palavraAtual = lista[i]
            contador = 1
        }
        listaComplementar.clear()
    }

    listaComplementar.add(palavraAtual.toString())
    listaComplementar.add(contador.toString())
    listaMutavel.add(listaComplementar.toString())

    var palavra = ""

    for (i in 0 until listaMutavel.size) {
        var numero = listaMutavel[i][4].toString().toInt()
        while (numero > 0) {
            palavra += listaMutavel[i][1]
            numero -= 1
        }

    }
    println(palavra.toList())
}

fun main() {
    decode()
}