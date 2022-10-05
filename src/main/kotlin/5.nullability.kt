fun main(){
    var result: Int? = 30
    println(result)
    println(result!!+1)
    println((result as Int)+1)
    divider()//not a kotlin built-in func
    result?.let {
        println(result)
    }
    divider()//not a kotlin built-in func
    val nullableInt: Int? = 10
    val mustHaveResult =nullableInt ?: 0
    println(mustHaveResult)
    divider()//not a kotlin built-in func
}