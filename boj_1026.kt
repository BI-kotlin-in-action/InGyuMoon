// boj 1026
fun main() {
    val n = readln().toInt()

    val a: MutableList<Int> = mutableListOf()
    val b: MutableList<Int> = mutableListOf()

    val inputA = readln().split(" ").map { it.toInt() }
    for (i in 0 until n) {
        a.add(inputA[i])
    }

    val inputB = readln().split(" ").map { it.toInt() }
    for (i in 0 until n) {
        b.add(inputB[i])
    }

    a.sort()
    b.sortDescending()

    var sum = 0
    for (i in 0 until n) {
        sum += (a[i] * b[i])
    }

    println(sum)
}
