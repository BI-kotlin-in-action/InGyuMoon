// boj 1026
fun main() {
    val n = readln().toInt()

    val inputA = readln().split(" ").map { it.toInt() }.toMutableList()
    val inputB = readln().split(" ").map { it.toInt() }.toMutableList()

    inputA.sort()
    inputB.sortDescending()

    val sum = inputA.zip(inputB).sumOf { (it1, it2) -> it1 * it2 }

    println(sum)
}
