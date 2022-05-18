package Proxy.hide

class DatabaseProxy : Database {
    private val db: Database = DatabaseMySQL()
    override fun insertSMS(SMS: String?) {
        db.insertSMS("some sms")
        println("proxy inserting SMS")
    }
}
