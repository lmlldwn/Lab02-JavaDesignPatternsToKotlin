package Template

abstract class Game {
    var game : String = ""
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    //template method
    fun play() : String{

        //initialize the game
        initialize()

        //start game
        startPlay()

        //end game
        endPlay()

        return game
    }
}
