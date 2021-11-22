public class Horse(food: String, location: String) : Animal(food, location) {
    val color = "Brown"

    override fun makeNoise() {
        println("Horse of color $color niaghs")
    }

    override fun eat() {
        println("Horse eats $food")
    }

    override fun sleep() {
        println("Horse sleeps at $location")
    }
}