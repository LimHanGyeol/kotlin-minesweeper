package minesweeper.exception

class InvalidMineException : InvalidResourceException(INVALID_MINE_MESSAGE) {

    companion object {
        private const val INVALID_MINE_MESSAGE = "지뢰는 1개 이상 설치할 수 있습니다. 다시 확인해주세요."
    }
}
