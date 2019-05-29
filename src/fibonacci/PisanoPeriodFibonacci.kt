package fibonacci

import java.math.BigDecimal
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.next().toBigDecimal()
    val m = scanner.next().toInt()

    System.out.println(countFibonacci(n, m))
}

fun countFibonacci(n: BigDecimal, m: Int): Int {
    when (n) {
        BigDecimal.ZERO -> return 0
        BigDecimal.ONE -> return 1
        else -> {
            var n1 = 1
            var n2 = 0
            var i = BigDecimal(2)
            val p = ArrayList<Int>()

            p.add(n2)
            p.add(n1)
            var period: Int? = null

            while (i < n) {
                val fib = (n1 + n2) % m
                p.add(fib)
                n2 = n1
                n1 = fib
                i++
                val length = p.size
                if (length % 2 == 0 && p.subList(0, length / 2) == (p.subList(length / 2, length))) {
                    period = length / 2
                    break
                }
            }

            return if (period != null) {
                val index = (n % period.toBigDecimal()).toInt()
                p[index]
            } else {
                ((n1 + n2) % m)
            }
        }
    }
}
