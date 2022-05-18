package Proxy.hide

class DatabaseMySQL : Database {
    fun connect() {
        println("proxy db connected")
    }

    fun disconnect() {
        println("proxy db disconnected")
    }

    override fun insertSMS(SMS: String?) {
        connect()
        println("Inserting to mysql db")
        disconnect()
    }
}