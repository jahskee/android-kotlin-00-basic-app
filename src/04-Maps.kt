fun main(args: Array<String>) {
    // Maps
    var dogs = mapOf<String, Int>("Fido" to 8, "Sarah" to 15, "Sean" to 54)
    println(dogs["Fido"])

    // Create a map where you have 3 entries, and each entry you have a word for the key, and
    // definintion for the value
    var nicksDictionary = mapOf(3 to "Koala")
    println(nicksDictionary[3])

    var dicts = mapOf("Kotlin" to "A baller programming language",
                    "Ice Cream" to "nectar of the gods",
                    "7-11" to "The best confi in the nation"

                )

    for(dict in dicts) {
        println(dict.key)
    }

}