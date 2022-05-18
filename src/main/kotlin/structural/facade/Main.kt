package structural.facade

class Main {
}

fun main() {
    var shop : Shop = Shop();
    shop.addItem();
    shop.addItem();
    shop.addItem();

    shop.pay()
    shop.deliver("Cavite");
}