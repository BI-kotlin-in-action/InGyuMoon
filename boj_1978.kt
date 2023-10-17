import kotlin.math.sqrt

//boj 1978
fun main() {
    readln().toInt()
    val cnt = readln().split(" ").map { it.toInt() }.count(::isPrime)

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
