package minesweeper.domain

import minesweeper.exception.InvalidPositionException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@DisplayName("위치를 관리하는 Position 테스트")
class PositionTest {

    @Test
    @DisplayName("올바른 위치를 확인한다.")
    fun correctly() {
        val position = Position(3, 3)

        assertThat(position.x).isEqualTo(3)
        assertThat(position.y).isEqualTo(3)
    }

    @ParameterizedTest
    @CsvSource(value = ["0,3", "-1, 3", "3,0", "3, -1"])
    @DisplayName("0 이하의 값은 x or y 로 사용 될 수 없다.")
    fun invalidX(x: Int, y: Int) {
        assertThrows<InvalidPositionException> { Position(x, y) }
    }
}
