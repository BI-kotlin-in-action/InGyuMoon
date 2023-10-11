import java.util.*
//boj 2178
var n: Int = 0
var m: Int = 0

val maze = Array(101) { IntArray(101) }
val visited = Array(101) { BooleanArray(101) { false } }
val distence = Array(101) { IntArray(101) { 0 } }
val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

//boj 2178
fun main() {
    val scanner = Scanner(System.`in`)

    n = scanner.nextInt()
    m = scanner.nextInt()

    var str = ArrayList<String>()
    for (i in 0 until n) {
        val temp = scanner.next()
        str.add(temp)
    }
    
    for (i in 0 until n) {
        for (j in 0 until str[i].length) {
            maze[i][j] = str[i][j].toString().toInt()
        }
    }
    println(sol() + 1)
}

fun sol(): Int {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(0 to 0)
    visited[0][0] = true

    while (!que.isEmpty()) {
        val a: Int = que.element().first
        val b: Int = que.element().second
        que.remove()
        
        for (i in 0..3) {
            if (a + dx[i] >= 0 && b + dy[i] >= 0 && maze[a + dx[i]][b + dy[i]] == 1 && !visited[a + dx[i]][b + dy[i]]) {
                que.add(a + dx[i] to b + dy[i])
                visited[a + dx[i]][b + dy[i]] = true
                distence[a + dx[i]][b + dy[i]] = distence[a][b] + 1
            }
        }
        if (a === n - 1 && b === m - 1) {
            return distence[a][b]
        }
    }
    return 0
}
