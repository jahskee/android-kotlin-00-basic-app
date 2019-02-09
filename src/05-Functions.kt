fun main(args: Array<String>) {

    fun hello() {
        println("Hello World!")
    }

    println("Hi!")
    for (x in 1..100) {
        hello()
    }

    fun addAndPrint(number1: Int = 0, number2: Int = 0) : Int {
        return number1 + number2
    }

    val retval = addAndPrint(4, 6)
    println(retval)


    fun dogInfo(name: String, age: Int) {
        // string interpolation
        println("$name is $age years old :)")
    }

    dogInfo("Fido", 8)
    dogInfo("Sarah", 22)
}