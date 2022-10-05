fun main(){
//    if expression and not statement
    val x= if(true) 15 else 20
    println(x)
    divider()//not a kotlin built-in func
//    val closedRange = 0..5
    val closedRange = IntRange(0,5)
    println(closedRange)
//    val halfOpenRange = 0 until 5
    val halfOpenRange = IntRange(0,4)
    println(halfOpenRange)
//    val decreasingRange = 5 downTo 0
    val decreasingRange = IntRange(5,0)
    println(decreasingRange)
    divider()//not a kotlin built-in func
    var sum = 0
    //i is by-default val
    for (i in 1..10) {
//        i++
        sum += i
    }
    println(sum)
    divider()//not a kotlin built-in func
    var nsum = 1
    repeat(10) {
        index-> nsum+=index
    }
    println(nsum)
    divider()//not a kotlin built-in func
    var evenSum = 0
    for (i in 0..10 step 2) {
        evenSum += i
    }
    println(evenSum)
    divider()//not a kotlin built-in func
        var ltriangleSum = 0
        rowLoop@ for (row in 0 until 8) {
            columnLoop@ for (column in 0 until 8) {
                if (row == column) {
                    continue@rowLoop
                }
                ltriangleSum += row * column
            }
        }
    println(ltriangleSum)
    divider()//not a kotlin built-in func
    val number=10
    when(number){
        0-> println("Zero")
        else-> println("Not Zero")
    }
    divider()//not a kotlin built-in func
    val string = "Dog"
    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet.")
        else -> println("Animal is not a house pet.")
    }
    divider()//not a kotlin built-in func
    val num=10
    val numberName = when (num) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            "Unknown"
        }
    }
    println(numberName)
    divider()//not a kotlin built-in func
    val hourOfDay = 12
    val timeOfDay: String
//    timeOfDay = when (hourOfDay) {
//        0, 1, 2, 3, 4, 5 -> "Early morning"
//        6, 7, 8, 9, 10, 11 -> "Morning"
//        12, 13, 14, 15, 16 -> "Afternoon"
//        17, 18, 19 -> "Evening"
//        20, 21, 22, 23 -> "Late evening"
//        else -> "INVALID HOUR!"
//    }
    //or
    timeOfDay = when (hourOfDay) {
        in 0..5 -> "Early morning"
        in 6..11 -> "Morning"
        in 12..16 -> "Afternoon"
        in 17..19 -> "Evening"
        in 20..23 -> "Late evening"
        else -> "INVALID HOUR!"
    }
    println(timeOfDay)
    divider()//not a kotlin built-in func
    when {
        number % 2 == 0 -> println("Even")
        else -> println("Odd")
    }
    divider()//not a kotlin built-in func
}