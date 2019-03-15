package delegates

import org.junit.Test
import kotlin.system.measureTimeMillis

@Suppress("FunctionName")
class MutableLazyTests {

    @Test
    fun `I don't have to wait if I changed value first`() {
        val time = measureTimeMillis {
            var game: Game? by mutableLazy { readGameFromSave() }
            game = Game()
            print(game)
        }
        assert(time in 0..100)
    }

    @Test
    fun `I have to wait if I changed value first`() {
        val time = measureTimeMillis {
            val game: Game? by mutableLazy { readGameFromSave() }
            print(game)
        }
        assert(time in 450..550)
    }

    private class Game()

    private fun readGameFromSave(): Game? {
        Thread.sleep(500)
        return Game()
    }
}
