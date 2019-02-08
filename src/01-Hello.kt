fun main(args: Array<String>) {

    /* 1. first section */
    // this is a one liner comment
    println("Hello World my name is Jaizon Lubaton!")

    val age : Int = 28
    println(age)

    var candy:String = "Snickers";
    candy = "Fun Dip"

    println(candy)

    var weather = "Sunny"
    println(weather)


    /* 2. Do some math - multi-line comment */
    var pi : Double = 3.14
    var radius : Int = 3
    var c : Int = pi.toInt() * radius * 2

    println(c)

    /* 3. Challenge */
    // Create an age variable that is equal to your age

    var age1: Int = 28

    // add 40 on to your age

    age1 += 40

    // In a comment, say what you will be doing on this day, in 40 days.

    // I will be visiting grand children in my electric self driving RV with my wife.


    /*4. Section 4 */

    var catIsAlive : Boolean = false
    var canRideTheRide : Boolean = age > 10
    print(canRideTheRide)

    if ( age >= 18 ) {
        println("Come on down!")
    } else {
        print("come back when you're older")
    }

    var day = "Tuesday"
    if (day != "Friday") {
        println("The day is not friday")
    }

}