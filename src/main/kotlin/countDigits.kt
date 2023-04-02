fun main(args: Array<String>) {
    val noOfDigits = countDigits(12345)
    println(noOfDigits)
}

fun countDigits(n: Int): Int {
    var number = n
    var count = 0
    while (number>0) {
        number /= 10
        count++
    }
    return count
}