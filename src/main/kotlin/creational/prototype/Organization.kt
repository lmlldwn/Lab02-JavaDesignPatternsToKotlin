package creational.prototype

open class Organization : Cloneable {
    var id = -1
    var name = ""
    var address = ""

    public override fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone!!
    }
}