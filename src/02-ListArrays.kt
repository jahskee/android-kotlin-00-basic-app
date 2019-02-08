fun main(args: Array<String>) {

    // can be mutated
    var topCandy: Array<String> = arrayOf("Snickers", "Fun Dip", "MilkyWay")

    // A list that cannot be mutated
    var topCandy2 : List<String> = listOf<String>("Snickers", "Fun Dip", "Milkyway")

    // A list that can be mutated
    var topCandy3: MutableList<String> = mutableListOf("Snickers", "Fun Dip", "MilkyWay")


    topCandy3.add(2, "Back Thunder")
    println(topCandy3)

    var luckyNumbers = arrayOf(5, 17, 39, 4, 52, 512, 2)
    println("first = "+luckyNumbers.first())
    println("size = "+luckyNumbers.size)
}