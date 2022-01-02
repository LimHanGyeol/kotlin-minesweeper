package minesweeper.exception

class InvalidWidthException : InvalidResourceException(INVALID_WIDTH_MESSAGE) {

    companion object {
        private const val INVALID_WIDTH_MESSAGE = "너비는 0보다 커야합니다. 다시 입력해주세요."
    }
}
