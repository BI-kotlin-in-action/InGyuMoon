// boj 10836
fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val m = input[0]
    val n = input[1]

    val vec = Array(n) { IntArray(3) }

    for (i in 0 until n) {
        val temp = readln().split(" ").map { it.toInt() }
        vec[i][0] = temp[0]
        vec[i][1] = temp[1]
        vec[i][2] = temp[2]
    }

    val answer = IntArray(2 * m) { 1 }

    for (i in 0 until n) {
        var idx = 1
        for (j in 0 until 3) {
            // Triple 사용시 j의 인덱스에 접근이 힘들것 같습니다.
            val num = vec[i][j]
            for (k in 0 until num) {
                answer[idx++] += j
            }
        }
    }

    for (i in 0 until m) {
        for (j in 0 until m) {
            if (j == 0) {
                print("${answer[m - i]} ")
            } else {
                print("${answer[m + j]} ")
            }
        }
        println()
    }
}
