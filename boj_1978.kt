import java.lang.Math.sqrt
import java.util.Scanner

//boj 1978
fun main() {
    val reader = Scanner(System.`in`)
    val num = reader.nextInt()
    // val num = readln().toInt()
    var temp: Int
    var cnt = 0

    for (i in 1..num) {
        temp = reader.nextInt()
        if (isPrime(temp)) {
            cnt++
        }
    }
    println(cnt)
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
