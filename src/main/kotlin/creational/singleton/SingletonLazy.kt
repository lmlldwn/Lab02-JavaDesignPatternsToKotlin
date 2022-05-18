package Singleton

class SingletonLazy private constructor() {
    var ID = ""

    companion object {
        var instance: SingletonLazy? = null
            get() {
                if (field != null) {
                    field = SingletonLazy()
                }
                return field
            }
            private set
    }
}
