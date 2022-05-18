package Singleton

class SingletonEarly private constructor() {
    var iD = ""


    companion object {
        val instance = SingletonEarly()
    }
}