fun main(){
    printMultipleOf(4, 2)
    printMultipleOf(multiplier = 4, andValue = 2)
    printMultipleOf(andValue = 2,multiplier = 4)
    printMultipleOf(andValue = 2)
    divider()//not a kotlin built-in func
    val (product, quotient) = multiplyAndDivide(4, 2)
    println(product) //product and quotient are by-default 'val'
    println(quotient)
    divider()//not a kotlin built-in func
    println(getValue(10))
    println(getValue("10"))
    divider()//not a kotlin built-in func
        //Method reference operator '::'
        val pmo=::printMultipleOf
        pmo(4,5)
    divider()//not a kotlin built-in func
    val gval:(Int)->Int = ::getValue
    println(gval(15))
    divider()//not a kotlin built-in func
    printResult(::add,5,7)
    divider()//not a kotlin built-in func
}

fun printMultipleOf(multiplier: Int=1, andValue: Int) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int>
{
    return Pair(number * factor, number / factor)
}

fun getValue(value: Int): Int {
    return value + 1
}
fun getValue(value: String): String {
    return "The value is $value"
}
fun add(x:Int,y:Int):Int{
    return x+y
}
fun printResult(function: (Int, Int) -> Int, a: Int, b: Int) {
    val result = function(a, b)
    println(result)
}
