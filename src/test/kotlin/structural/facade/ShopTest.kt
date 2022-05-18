package structural.facade

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ShopTest {
    @Test
    fun testInventorySingleItem() {
        val expected = 1
        val shop = Shop()
        shop.addItem()
        assertEquals(expected,shop.checkItem())
    }

    @Test
    fun testInventoryMultipleItems() {
        val expected = 3
        val shop = Shop()
        shop.addItem()
        shop.addItem()
        shop.addItem()
        assertEquals(expected,shop.checkItem())
    }

    @Test
    fun testDeliveryAddress() {
        val expected = "Mandaluyong"
        val shop = Shop()
        assertEquals(expected,shop.deliver("Mandaluyong"))
    }

    @Test
    fun testBillingReceiptSingleItem() {
        val expected = 100
        val shop = Shop()
        shop.addItem()
        assertEquals(expected, shop.pay())
    }

    @Test
    fun testBillingReceiptMultipleItem() {
        val expected = 400
        val shop = Shop()
        shop.addItem()
        shop.addItem()
        shop.addItem()
        shop.addItem()
        assertEquals(expected, shop.pay())
    }






}