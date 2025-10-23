class Node(var key: Int) {
    var left: Node? = null
    var right: Node? = null

    fun insert(value: Int) {
        if (value > this.key) {
            if (this.right == null) {
                this.right = Node(value)
            } else {
                this.right!!.insert(value)
            }
        } else if (value < this.key) {
            if (this.left == null) {
                this.left = Node(value)
            } else {
                this.left!!.insert(value)
            }
        }
    }

    fun leafCount(): Int {
        if (left == null && right == null) return 1
        var count = 0
        if (left != null) count += left!!.leafCount()
        if (right != null) count += right!!.leafCount()
        return count
    }

    fun leafValues(): List<Int> {
        if (left == null && right == null) return listOf(key)
        val values = mutableListOf<Int>()
        if (left != null) values.addAll(left!!.leafValues())
        if (right != null) values.addAll(right!!.leafValues())
        return values
    }

    fun convertToString(): String {
        if (left == null && right == null) return key.toString()
        val leftStr = left?.convertToString() ?: ""
        val rightStr = right?.convertToString() ?: ""
        return "$key($leftStr,$rightStr)"
    }

    fun printInOrder() {
        left?.printInOrder()
        print("$key ")
        right?.printInOrder()
    }
}