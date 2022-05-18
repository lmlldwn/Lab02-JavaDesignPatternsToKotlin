package structural.facade

class Shop {
    private var inventory : Inventory = Inventory();
    private var billing : Billing = Billing();
    private var delivery : Delivery = Delivery();

    fun addItem() {
        inventory.addItem();
    }

    fun pay() {
        billing.printReceipt(inventory.items);
    }

    fun deliver(address:String) {
        delivery.deliver(address);
    }


}