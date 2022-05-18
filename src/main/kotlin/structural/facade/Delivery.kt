package structural.facade

class Delivery {

    var address: String = ""
        set(value) {
            field = value
            println("Address has been updated.")
        }

    fun deliver() : String {
        println("On the way to $address")
        return address
    }
}