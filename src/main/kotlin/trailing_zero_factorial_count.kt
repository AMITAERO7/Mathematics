fun main(args: Array<String>) {
    countTrailingZero()
}

fun countTrailingZero() {
    val number = 10
    var factorial = 1
    for (i in 2..number) {
        factorial *= i
    }
    println("Factorial is :$factorial")
    var trailingCount = 0
    var n = factorial
    while(n%10 == 0) {
        trailingCount++
        n /= 10
    }
    println("Trailing Count is :$trailingCount")
}