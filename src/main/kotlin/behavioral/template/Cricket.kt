package Template

class Cricket() : Game() {



    override fun initialize() {
        println("Cricket Game Initialized! Start Playing.")
        this.game = "Cricket"
    }

    override fun startPlay() {
        println("Cricket Game Started. Enjoy the game!")

    }

    override fun endPlay() {
        println("Cricket Game Finished!")
    }
}
