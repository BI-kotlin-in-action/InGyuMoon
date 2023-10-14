import java.lang.Math.sqrt
import java.util.Scanner

//boj 1978
fun main() {
    val reader = Scanner(System.`in`)

    val num = readln().toInt()
    // val num = reader.nextInt()

    var temp: Int
    var cnt = 0

    for (i in 1..num) {
        temp = reader.nextInt()
        /**
         * 이 부분을 readln().toInt()로 입력을 받으면 (NumberFormat) 오류가 발생해서
         * reader.nextInt()를 사용했습니다.
         * 입력을 받고 띄어 쓰기를 사용해서 그런것 같아요.
         */
        if (isPrime(temp)) {
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
