package behavioral.strategy

fun main() {
    var waterProcess : WaterProcessing = FreezeWater();
    println("Setting temperature to: ${waterProcess.getTemperature()}" );

    var waterProcess2 : WaterProcessing = CoolWater();
    println("Setting temperature to: ${waterProcess2.getTemperature()}" );

    var waterProcess3 : WaterProcessing = BoilWater();
    println("Setting temperature to: ${waterProcess3.getTemperature()}" );

}