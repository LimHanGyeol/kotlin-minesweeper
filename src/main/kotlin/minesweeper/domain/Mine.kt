package minesweeper.domain

import minesweeper.exception.InvalidMineException

@JvmInline
value class Mine(
    val count: Int,
) {
    init {
        if (count <= MIN_MINE_COUNT) {
            throw InvalidMineException()
        }
    }

    companion object {
        private const val MIN_MINE_COUNT = 0
    }
}
