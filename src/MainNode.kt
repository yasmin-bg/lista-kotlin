fun main() {
    val raiz = Node(10)
    raiz.insert(5)
    raiz.insert(15)
    raiz.insert(3)
    raiz.insert(7)
    raiz.insert(12)
    raiz.insert(18)

    println("Questão 9 – Árvore em ordem:")
    raiz.printInOrder()
    println("\nQuestão 10 – Quantidade de folhas: ${raiz.leafCount()}")
    println("Questão 11 – Valores das folhas: ${raiz.leafValues()}")
    println("Questão 12 – Conversão para string: ${raiz.convertToString()}")
}
