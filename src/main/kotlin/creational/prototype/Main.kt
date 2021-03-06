package creational.prototype


private val organizationCache = HashMap<String, Organization>()
fun main(){

    var org: Organization = Community()
    org.name = "PADC"
    org.id = 1
    org.address = "Philippines"

    organizationCache.put(org.name, org)

    org = Company()
    org.name = "SeaOil"
    org.id = 1
    org.address = "Philippines"

    organizationCache.put(org.name, org)
    println(org) //view objectID

    val company : Organization = organizationCache.get("SeaOil")?.clone() as Company
    println(company) //view objectID of clone
}