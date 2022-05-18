package creational.singleton

import Singleton.SingletonEarly
import Singleton.SingletonLazy
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SingletonTest {
    @Test
    fun testSingletonEarlyInstanceId() {
        val instance1: SingletonEarly = SingletonEarly.instance
        instance1.iD  = "Sample for Instance 1"
        val instance2 : SingletonEarly = SingletonEarly.instance

        assertEquals(instance1,instance2)
    }

    @Test
    fun testSingletonEarlyAttributeId() {
        val instance1: SingletonEarly = SingletonEarly.instance
        instance1.iD  = "Sample for Instance 1"
        val instance2 : SingletonEarly = SingletonEarly.instance
        instance2.iD  = "Sample for Instance 4"

        assertEquals(instance1.iD, instance2.iD)
    }

    @Test
    fun testSingletonLazyInstanceId() {
        val instanceOne = SingletonLazy.instance
        val instanceTwo = SingletonLazy.instance
        assertEquals(instanceOne, instanceTwo)
    }

    @Test
    fun testSingletonLazyAttributeId() {
        val instanceOne = SingletonLazy.instance
        val instanceTwo = SingletonLazy.instance
        instanceOne?.ID = "I am instance ONE!"
        instanceTwo?.ID = "I am instance TWO!"

        assertEquals(instanceOne?.ID, instanceTwo?.ID)
    }

}