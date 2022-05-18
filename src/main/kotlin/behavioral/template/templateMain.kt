package Template

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var game: Game = Cricket()
        game.play()
        println("======================================")
        game = Football()
        game.play()
    }
}
