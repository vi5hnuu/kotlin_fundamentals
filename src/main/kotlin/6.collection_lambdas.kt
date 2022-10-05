import java.util.*
import java.util.function.Predicate
import kotlin.math.max

fun main(){
    val evenNumbers:Array<Int> = arrayOf(2, 4, 6, 8)//Array<Int>
//    val fivrFives=Array(5){index->index+1}
    val fivrFives=Array(5,::plusOne)
    println(Arrays.toString(fivrFives))
    divider()//not a kotlin built-in func
    for(item in intArrayOf(2,3,4,5)){
        println(item)
    }
    intArrayOf(2,3,4,5).forEach(::println)
    divider()//not a kotlin built-in func
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")//immutable
    println(innerPlanets)
    divider()//not a kotlin built-in func
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus",
        "Neptune")//mutable
    println(outerPlanets)
    divider()//not a kotlin built-in func
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println(players.isEmpty())
    println(players.size)
    println(players.first())
    println(players.first { name->name=="Bob" })
    val firstPlayer = players[0]
    println("First player is $firstPlayer")
    val secondPlayer = players.get(1)
    println(secondPlayer)
    println(players.slice(1..2))
    players.add("Eli")
    players+="vishnu"
    players.add(5, "Frank")
    players[0]="Krishan"
    players[1]="manisha"
    println(players)
    divider()//not a kotlin built-in func
    for ((index, player) in players.withIndex()) {
        println("${index + 1}. $player")
    }
    divider()//not a kotlin built-in func
    var array = arrayOf(1, 2, 3)
    val lstref=array
    array += 4
    println(array.joinToString()) // > 1, 2, 3, 4
    println(lstref==array)//new arrayy is created
    divider()//not a kotlin built-in func
    val yearOfBirth = mutableMapOf<String,Int>("Vishnu" to 2002, "Krishan" to 2003, "Manisha"
            to 1996, "Laxmi" to 2005)
    println(yearOfBirth)
    println(yearOfBirth.get("Vishnu"))
    println(yearOfBirth["Vishnu"])
    yearOfBirth+= "Vishnu" to 2002
    println(yearOfBirth)
    for ((person, DOB) in yearOfBirth) {
        println ("$person - $DOB")
    }
    println(yearOfBirth.keys)
    println(yearOfBirth.values)
    divider()//not a kotlin built-in func
    println("vishnu".hashCode())
    println((1).hashCode())
    divider()//not a kotlin built-in func
    var names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)
    names+="abc"//names.plus("abc") return new set [names is declared as var]
    println(names)
    divider()//not a kotlin built-in func
    val vowels="aaeioueioaeioaeiouuu".toSet()
    println(vowels)
    divider()//not a kotlin built-in func
    val multiplyLambda:(Int,Int)->Int
    multiplyLambda={a:Int,b:Int->a+b}
    println(multiplyLambda(2,3))
    divider()//not a kotlin built-in func
    val square: (Int) -> Int = { it * it }
    println(square(10))
    divider()//not a kotlin built-in func
    operateOnNums(5,7,::max)
    operateOnNums(5,7,Int::plus)
    operateOnNums(5,7,{x:Int,y:Int->x+y})
    operateOnNums(5,7){x:Int,y:Int->x+y}
    divider()//not a kotlin built-in func
    //closures
    val counter1=counter()
    println(counter1())
    println(counter1())
    println(counter1())

    val counter2=counter(11)
    println(counter2())
    println(counter2())
    println(counter2())
    divider()//not a kotlin built-in func
    val values = listOf(1, 2, 3, 4, 5, 6)
    values.forEach {
        println("$it: ${it * it}")
    }
    divider()//not a kotlin built-in func
    //we created a companion object and referenced its test method [not the predicate itself]
    values.filter(object : Predicate<Int>{
        override fun test(t: Int): Boolean {
            return t>2
        }
    }::test).forEach(::println)
    divider()//not a kotlin built-in func
    values.filter { it>2 }.forEach(::println)
    divider()//not a kotlin built-in func
    val dblValues=values.map({ it * it })
    println(dblValues)
    divider()//not a kotlin built-in func
//    val maxVal=values.fold(Int.MIN_VALUE,::max)
//    val maxVall=values.fold(Int.MIN_VALUE,{a,b-> max(a,b)})
//    val maxValll=values.fold(Int.MIN_VALUE){a,b-> max(a,b)}

    val maxVal=values.reduce(::max)
    val maxVall=values.reduce({a,b-> max(a,b)})
    val maxValll=values.reduce{a,b-> max(a,b)}
    println(maxVal)
    println(maxVall)
    println(maxValll)
    divider()//not a kotlin built-in func
    divider()//not a kotlin built-in func
    divider()//not a kotlin built-in func
    divider()//not a kotlin built-in func
}

fun plusOne(num:Int):Int{
    return num+1
}
fun operateOnNums(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    val ans=operation(a,b)
    println(ans)
    return ans
}

fun counter(start:Int=0):()->Int{
    var counter=start
    return {counter++}
}