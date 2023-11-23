import java.util.Queue
import java.util.LinkedList

// swea 1226. [S/W 문제해결 기본] 7일차 - 미로1
val maze = Array(16) { IntArray(16) }
val visited = Array(16) { BooleanArray(16) }
val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

var start_x = 1
var start_y = 1
var ans = 0
fun main() {
    for (testcase in 0 until 10) {
        val num = readln().toInt()
        for (i in 0 until 16) {
            val input = readln()
            for (j in 0 until 16) {
                maze[i][j] = input[j] - '0'
                if (maze[i][j] == 2) {
                    start_x = i
                    start_y = j
                }
            }
        }
        
        for (i in 0 until 16) {
            for (j in 0 until 16) {
                visited[i][j] = false
            }
        }
        ans = 0
        sol()
        println("#" + (testcase + 1) + " " + ans)
    }
}
fun sol() {
    var que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(start_x, start_y))
    while (!que.isEmpty()) {
        val a = que.peek().first
        val b = que.peek().second
        que.poll()
        for (i in 0 until 4) {
            val x = a + dx[i]
            val y = b + dy[i]

            if (maze[x][y] == 1 || x < 0 || y < 0 || x > 99 || y > 99) {
                continue
            }
            if (maze[x][y] == 3) {
                ans = 1
                return
            }
            if (!visited[x][y]) {
                visited[x][y] = true
                que.add(Pair(x, y))
            }
        }
    }
}
