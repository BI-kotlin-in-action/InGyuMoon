import java.lang.Math.sqrt
import java.util.Scanner

//boj 1978
fun main() {
    val reader = Scanner(System.`in`)
    val num = readln().toInt()
    var cnt = 0

    val inputs = readln().split(" ").map { it.toInt() }
    for (input in inputs) {
        if (isPrime(input)) {
            cnt++
        }
    }
    println(cnt)

    reader.close()
}

fun isPrime(temp: Int): Boolean {
    if (temp == 1) {
        return false
    }
    for (i in 2..sqrt(temp.toDouble()).toInt()) {
        if (temp % i == 0) {
            return false
        }
    }
    return true
}
