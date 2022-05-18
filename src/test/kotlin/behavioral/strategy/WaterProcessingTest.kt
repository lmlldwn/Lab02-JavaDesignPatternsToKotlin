package behavioral.strategy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WaterProcessingTest{
    @Test
    fun testGetTemperatureBoilWater(){
        val expected = 100
        var waterProcess:WaterProcessing = BoilWater()
        assertEquals(expected, waterProcess.getTemperature())
    }

    @Test
    fun testGetTemperatureCoolWater(){
        val expected = 15
        var waterProcess:WaterProcessing = CoolWater()
        assertEquals(expected, waterProcess.getTemperature())
    }

    @Test
    fun testGetTemperatureFreezeWater(){
        val expected = 0
        var waterProcess:WaterProcessing = FreezeWater()
        assertEquals(expected, waterProcess.getTemperature())
    }

}