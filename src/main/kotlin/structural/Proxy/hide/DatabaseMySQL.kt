package Proxy.hide

class DatabaseMySQL : Database {
    fun connect() {
        println("proxy db connected")
    }

    fun disconnect() {
        println("proxy db disconnected")
    }

    override fun insertSMS(SMS: String?) : Boolean {
        connect()
        println("Inserting to mysql db: $SMS")
        disconnect()

        return true
    }
}