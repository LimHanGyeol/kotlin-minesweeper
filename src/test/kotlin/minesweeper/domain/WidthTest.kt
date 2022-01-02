package minesweeper.domain

import minesweeper.exception.InvalidWidthException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("너비 테스트")
class WidthTest {

    @ParameterizedTest
    @ValueSource(ints = [1, 5, 10])
    @DisplayName("1 이상의 너비를 입력할 수 있다.")
    fun input(value: Int) {
        val width = Width(value)

        assertThat(width.value).isEqualTo(value)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, -1, -5])
    @DisplayName("너비는 0 미만일 수 없다.")
    fun inputForThrow(value: Int) {
        assertThrows<InvalidWidthException> { Width(value) }
    }
}
