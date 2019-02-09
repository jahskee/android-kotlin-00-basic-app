fun main(args: Array<String>) {
    println("hello world")

    // Classes
    class Dog (name: String, age: Int, furColor: String) {
        var name = ""
        var age = 0
        var furColor = ""
        var weight = 0.0

    }

    var myDog = Dog("Brian", 29, "white")
    myDog.age = 6
    myDog.name = "Brian"
    myDog.furColor = "Brown"
    println(myDog.name)

    var otherDog = Dog("Sara", 17, "white")
    println(otherDog.age)

    otherDog.name = "Sarah"
    println(otherDog.name)
}