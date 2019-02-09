fun main(args: Array<String>) {
    // Classes
    class Dog (name: String, age: Int, furColor: String, weight: Double) {
        var name = name
        var age = age
        var furColor = furColor
        var weight = weight

        fun info() {
            println("$name is $age years old, has $furColor fur and is $weight lbs!")
        }

    }

    var myDog = Dog("Brian", 29, "white")
    myDog.info()

    var otherDog = Dog("Sara", 17, "white")
    otherDog.info()

}