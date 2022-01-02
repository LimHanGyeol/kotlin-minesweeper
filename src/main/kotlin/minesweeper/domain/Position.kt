package minesweeper.domain

import minesweeper.exception.InvalidPositionException

data class Position(
    val x: Int,
    val y: Int,
) {
    init {
        if (x <= MIN_COORDINATE || y <= MIN_COORDINATE) {
            throw InvalidPositionException()
        }
    }

    companion object {
        private const val MIN_COORDINATE = 0
    }
}
