package minesweeper.exception

class InvalidHeightException : InvalidResourceException(INVALID_HEIGHT_MESSAGE) {

    companion object {
        private const val INVALID_HEIGHT_MESSAGE = "높이는 0보다 높아야합니다. 다시 입력해주세요."
    }
}
