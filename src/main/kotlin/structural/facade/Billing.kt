package structural.facade

class Billing {
    fun printReceipt(itemsPurchased:Int) : Int{
        val price = 100;
        println("Items purchased: ${itemsPurchased}")
        println("Price per item: ${price}")

        var totalAmount : Int = price * itemsPurchased
        println("Total Amount: ${totalAmount}")

        return totalAmount
    }
}