package gcd

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().toInt()
    val b = scanner.next().toInt()

    System.out.println(countGcd(a, b))
}

fun countGcd(a: Int, b: Int): Int {
    return when {
        a == 0 -> b
        b == 0 -> a
        a >= b -> countGcd(a % b, b)
        else -> countGcd(a, b % a)
    }
}
