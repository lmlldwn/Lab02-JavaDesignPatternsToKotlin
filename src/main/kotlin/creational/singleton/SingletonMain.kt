package Singleton

    fun main(args: Array<String>) {
        val instance1: SingletonEarly = SingletonEarly.instance
        instance1.iD  = "Sample for Instance 1"
        println("Instance 1 ID" + instance1.iD)

        val instance2 : SingletonEarly = SingletonEarly.instance
        println("Instance 2 ID" + instance2.iD)


        val instanceOne = SingletonLazy.instance
        val instanceTwo = SingletonLazy.instance

        instanceOne?.ID = ("I am instance ONE!")
        println("Instance one ID " + instanceOne?.ID)
        println("Instance two ID " + instanceTwo?.ID)

        instanceTwo?.ID = ("I am instance TWO!")
        println("Instance one ID " + instanceOne?.ID)
        println("Instance two ID " + instanceTwo?.ID)


    }
