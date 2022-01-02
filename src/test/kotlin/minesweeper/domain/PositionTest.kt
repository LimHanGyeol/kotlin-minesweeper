package minesweeper.domain

import minesweeper.exception.InvalidPositionException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@DisplayName("위치를 관리하는 Position 테스트")
class PositionTest {

    @Test
    @DisplayName("올바른 위치를 확인한다.")
    fun correctly() {
        val position = Position(3, 3)

        assertThat(position.x).isEqualTo(3)
        assertThat(position.y).isEqualTo(3)
    }

    @Test
    @DisplayName("0 이하의 값은 x로 설정될 수 없다.")
    fun invalidX(x: Int, y: Int) {
        assertThrows<InvalidPositionException> { Position(0, 3) }
    }

    @Test
    @DisplayName("0 이하의 값은 y로 설정될 수 없다.")
    fun invalidY() {
        assertThrows<InvalidPositionException> { Position(3, 0) }
    }
}
