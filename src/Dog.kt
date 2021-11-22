public class Dog(food: String, location: String) : Animal(food, location) {
    val tailLength = 10

    override fun makeNoise() {
        println("Dog with tail length of $tailLength barks")
    }

    override fun eat() {
        println("Dog eats $food")
    }

    override fun sleep() {
        println("Dog sleeps at $location")
    }
}

