package structural.facade

class Inventory {
    var items: Int = 0
        private set(value){
            field = value
        }

    fun addItem() : Int{
        items += 1;
        return items;
    }


}