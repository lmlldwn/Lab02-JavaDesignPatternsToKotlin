package behavioral.strategy

class FreezeWater : WaterProcessing {
    override fun getTemperature() : Int {
        println("Water freezes at 0 degrees Celcius.")
        return 0
    }
}