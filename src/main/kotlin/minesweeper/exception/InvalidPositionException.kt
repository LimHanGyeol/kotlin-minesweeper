package minesweeper.exception

class InvalidPositionException : InvalidResourceException(INVALID_POSITION_MESSAGE) {

    companion object {
        private const val INVALID_POSITION_MESSAGE = "각 위치의 좌표가 올바르지 않습니다."
    }
}
