package minesweeper.domain

import minesweeper.exception.InvalidWidthException

@JvmInline
value class Width(
    val value: Int,
) {
    init {
        if (value < MIN_WIDTH) {
            throw InvalidWidthException()
        }
    }

    companion object {
        private const val MIN_WIDTH = 1
    }
}
