fun main(args: Array<String>) {
    // For Loops
    for ( count in 1..1_000) {
        println(count.toString() + " - I will not fight the future")
    }

    for ( x in 1..1_000) {
        println(x)
        println(x*2)
        println(x*x)
    }

    var topCandy : MutableList<String> = mutableListOf("Snickers", "Fun Dip", "MilkyWay", "Black Thunder")

    for (joe in topCandy) {
        println(joe)
    }

    for ( x in 1..10_000) {
        if (x> 693) {
            println(x)
        }
    }
}