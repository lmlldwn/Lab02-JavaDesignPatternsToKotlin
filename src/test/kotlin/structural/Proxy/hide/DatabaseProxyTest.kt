package structural.Proxy.hide

import Proxy.hide.Database
import Proxy.hide.DatabaseProxy
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DatabaseProxyTest {

    @Test
    fun proxyTest() {
        val database: Database = DatabaseProxy()
        assertTrue(database.insertSMS("Test"))
    }
}