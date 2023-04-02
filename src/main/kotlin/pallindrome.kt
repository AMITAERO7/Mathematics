fun main(args: Array<String>) {
    println(checkPalindrome(545))
}

fun checkPalindrome(n:Int): Boolean {
    var reverse = 0
    val temp = n
    var number = n
    while (number!=0) {
        val lastDigit = number % 10
        reverse = reverse * 10 + lastDigit
        number /= 10
    }
    return reverse == temp
}