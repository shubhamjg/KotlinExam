fun main() {
    val arr = arrayOf(78, 30, 24, 5, 19,17,89,90)
    val a = arr.toList()

    println("The Minimum Number is: ${a.minOrNull()}")
    println("The Maximum Number is: ${a.maxOrNull()}")
}

