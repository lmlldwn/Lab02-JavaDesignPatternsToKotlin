package behavioral.strategy

class CoolWater : WaterProcessing {
    override fun getTemperature(): Int {
        println("Cool water at 15 degrees Celcius.")
        return 15
    }
}