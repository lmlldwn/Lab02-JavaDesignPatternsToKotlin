package behavioral.strategy

class BoilWater : WaterProcessing{
    override fun getTemperature() : Int {
        println("Water boils at 100 degrees Celcius.")
        return 100
    }
}