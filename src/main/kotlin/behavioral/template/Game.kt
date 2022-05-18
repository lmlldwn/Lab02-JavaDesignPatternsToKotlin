package Template

abstract class Game {
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    //template method
    fun play() {

        //initialize the game
        initialize()

        //start game
        startPlay()

        //end game
        endPlay()
    }
}
