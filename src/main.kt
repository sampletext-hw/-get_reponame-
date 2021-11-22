fun main() {
    val animals = arrayOf(
        Cat("Rat", "House"),
        Dog("Meat", "Street"),
        Horse("Oats", "Farm")
    )

    val doctor = Doctor()
    animals.forEach {
        it.makeNoise()
        doctor.treatAnimal(it)
    }
}