//boj 10870
fun main() {
    val num = readln().toInt()
    val arr: MutableList<Int> = mutableListOf()
    var temp: Int
    arr.add(0)
    arr.add(1)
    for (i in 1..num) {
        temp = arr[i] + arr[i - 1]
        arr.add(temp)
    }
    println(arr[num])
}