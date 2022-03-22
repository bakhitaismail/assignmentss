fun main() {
    var toyota = Car("Toyota", "Mark X", "KDD 729", 0)
    toyota.start()
    toyota.accelerate(50)
    println(toyota.make)
    println(toyota.registration)
    var audi = Car("Audi", "A3", "KBB 182Z", 0)
    audi.start()
    audi.accelerate(50)
    println(audi.make)
    println(audi.registration)
    audi.hoot()
    toyota.hoot()
    println(audi.speed)
    audi.deccelerate(30)
    println(toyota.speed)
    toyota.deccelerate(50)
    toyota.stop()
    println(toyota.speed)
    audi.stop()
    println(audi.speed)
    var nancy = student("Nancy Chero", 22)
    println(nancy.name)





}
class Car(var make: String, var model: String, var registration: String, var speed: Int) {
    fun start() {
        println("vvrooooom")
    }

    fun accelerate(acceleration: Int): Int {
        speed += acceleration
        return speed
    }

    fun hoot() {
        println("piii piii piii")
    }

    fun deccelerate(decceleration: Int): Int {
        speed -= decceleration
        return speed
    }

    fun stop() {
        speed = 0
        println("stop")
    }

}
data class student(var name: String, var age: Int)