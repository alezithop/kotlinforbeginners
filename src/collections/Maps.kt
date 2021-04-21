package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAges2 = mapOf(
        "Peter" to(24),
        "Roger" to 42
    )

    println(namesToAges == namesToAges2)
    // printed: true
    println(namesToAges.keys)
    // printed: [Peter, Roger]
    println(namesToAges.values)
    // printed: [24, 42]
    println(namesToAges.entries)
    // printed: [Peter=24, Roger=42]

    val countryToInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000,
        "Australia" to 22_000_000
    )
    println(countryToInhabitants)
    // Put will enter and edit that value of the key
    countryToInhabitants.put("Australia", 23_000_000)
    // PutIfAbsent will not enter or edit that value of the key
    countryToInhabitants.putIfAbsent("USA", 320_000_000)
    println(countryToInhabitants)

    // all the validations will return TRUE
    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("Germany"))
    println(countryToInhabitants.containsValue(23_000_000))

    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 0))
    println(countryToInhabitants.getOrDefault("USA", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }
}