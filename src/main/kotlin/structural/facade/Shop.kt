package structural.facade

class Shop {
    private var inventory : Inventory = Inventory();
    private var billing : Billing = Billing();
    private var delivery : Delivery = Delivery();

    fun addItem() {
        inventory.addItem();
    }

    fun checkItem() : Int {
        return inventory.items;
    }

    fun pay() : Int {
        return billing.printReceipt(inventory.items)
    }

    fun deliver(address:String) : String {
        delivery.address = address
        return delivery.deliver()
    }


}