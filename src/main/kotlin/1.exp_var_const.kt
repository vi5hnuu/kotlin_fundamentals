import kotlin.math.*


fun main(){
    println("%.0f".format(28.0 % 10.0))
    println(sqrt(64.0))
    divider()//not a kotlin built-in func
    val number: Int = 10
    val num = 10 //inference
    println(number is Int)
    println(num is Int)
    divider()//not a kotlin built-in func
    val x:Int;
    x=15 //x in runtime constant[can be asigned one time]
    println(x)
//    x=12 error
    divider()//not a kotlin built-in func
    var xx:Int;
    xx=15
    println(xx)
    xx=12
    println(xx)
    divider()//not a kotlin built-in func
    var counter: Int = 0
//        counter += 1
//        counter =counter+1
        counter ++

    // counter = 1
    println(counter)
//        counter -= 1
//        counter =counter-1
        counter --

    println(counter)
    // counter = 0
    divider()//not a kotlin built-in func
}