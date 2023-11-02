// https://school.programmers.co.kr/learn/courses/30/lessons/181188?language=kotlin
fun main() {
}

fun solution(vec: Array<IntArray>): Int {
    var answer = 0

    vec.sortBy { it[0] }
    vec.sortBy { it[1] }

    var end = vec[0][1]

    for (i in 1 until vec.size) {
        if (vec[i][0] >= end) {
            answer++
            end = vec[i][1]
        } else {
            end = minOf(end, vec[i][1])
        }
    }
    return answer + 1
}
