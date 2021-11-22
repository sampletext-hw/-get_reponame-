public class Cat(food: String, location: String) : Animal(food, location) {
    val furLength = 3
    override fun makeNoise() {
        println("Cat with fur length of $furLength meows")
    }

    override fun eat() {
        println("Cat eats $food")
    }

    override fun sleep() {
        println("Cat sleeps at $location")
    }
}