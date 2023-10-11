import java.util.*

//boj 10870
fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val arr = ArrayList<Int>()
    var temp: Int
    arr.add(0)
    arr.add(1)
    for (i in 1..num) {
        temp = arr[i] + arr[i - 1]
        arr.add(temp)
    }
    println(arr[num])
}
