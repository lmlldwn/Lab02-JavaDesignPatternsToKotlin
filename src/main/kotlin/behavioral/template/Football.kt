package Template

class Football : Game() {
    override fun initialize() {
        println("Football Game Initialized! Start playing")
        this.game = "Football"

    }

    override fun startPlay() {
        println("Football Game Started. Enjoy the game!")

    }

    override fun endPlay() {
        println("Football Game Ended!")

    }
}
