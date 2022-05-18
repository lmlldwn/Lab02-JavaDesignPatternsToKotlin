package Template


    fun main(args: Array<String>) {
        var game: Game = Cricket()
        println(game.play())
        println("======================================")
        game = Football()
        println(game.play())
    }

