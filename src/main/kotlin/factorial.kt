fun main(args: Array<String>) {
   println(calculateFactorial(5))
}

fun calculateFactorial(n:Int):Int {
    return if (n==0)
        1
    else
        n * calculateFactorial(n-1)
}