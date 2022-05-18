package Template


    fun main(args: Array<String>) {
        var game: Game = Cricket()
        game.play()
        println("======================================")
        game = Football()
        game.play()
    }

