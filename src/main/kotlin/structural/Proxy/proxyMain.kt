package Proxy

import Proxy.hide.Database
import Proxy.hide.DatabaseProxy

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val database: Database = DatabaseProxy()
        database.insertSMS("Test")
    }
}