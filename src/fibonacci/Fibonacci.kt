package fibonacci

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.next().toInt()

    System.out.println(countFibonacci(n))
}

fun countFibonacci(n: Int): Int {
    when (n) {
        0 -> return 0
        1 -> return 1
        else -> {
            var n1 = 1
            var n2 = 0
            var i = 2

            while (i < n) {
                val fib = n1 + n2
                n2 = n1
                n1 = fib
                i++
            }

            return n1 + n2
        }
    }
}
