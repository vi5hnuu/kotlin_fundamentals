fun main(){
    divider()//not a kotlin built-in func
    var integer: Int = 100
    var decimal: Double = 12.5
//    integer = decimal //error
    integer=decimal.toInt()
    println(integer)
    divider()//not a kotlin built-in func
    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal."
    println(oneThirdLongString)
    divider()//not a kotlin built-in func
//    val bigString = """
//            You can have a string
//            that contains multiple
//            lines
//            by
//            doing this.
//            """.trimMargin()

    val bigString = """
            |You can have a string
                            |that contains multiple
|lines
                    |by
        |doing this.
            """.trimMargin("|")
    println(bigString)
    divider()//not a kotlin built-in func
    val coordinates:Pair<Int,Int> = Pair(1,2)
    println(coordinates)
    println(coordinates.first)
    println(coordinates.second)
//    coordinates.first=15//pairs are immutable
    divider()//not a kotlin built-in func
    val coords:Pair<Int,Int> = 1 to 2
    println(coords)
    println(coords.first)
    println(coords.second)
    divider()//not a kotlin built-in func
    val (xCord,yCord)=coords
    println(xCord)
    println(yCord)
    divider()//not a kotlin built-in func
    val coordinates3D = Triple(2, 3, 1)
    val (x3, y3, z3) = coordinates3D
    println(coordinates3D)
}