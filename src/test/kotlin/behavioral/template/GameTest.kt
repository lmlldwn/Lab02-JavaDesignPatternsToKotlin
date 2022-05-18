package behavioral.template

import Template.Cricket
import Template.Football
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GameTest {

    @Test
    fun gameCricket() {
        val cricket : Cricket = Cricket()
        val expected : String = "Cricket"
        assertEquals(expected, cricket.play())
    }

    @Test
    fun gameFootball() {
        val football : Football = Football()
        val expected : String = "Football"
        assertEquals(expected, football.play())
    }
}