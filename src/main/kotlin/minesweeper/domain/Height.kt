package minesweeper.domain

import minesweeper.exception.InvalidHeightException

@JvmInline
value class Height(
    val value: Int,
) {
    init {
        if (value < MIN_HEIGHT) {
            throw InvalidHeightException()
        }
    }

    companion object {
        private const val MIN_HEIGHT = 1
    }
}
