package Proxy.hide

class DatabaseProxy : Database {
    private val db: Database = DatabaseMySQL()
    override fun insertSMS(SMS: String?) : Boolean {
        println("proxy inserting $SMS")
        return db.insertSMS(SMS)
    }
}
