package minesweeper.domain

import minesweeper.exception.InvalidHeightException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("높이 테스트")
class HeightTest {

    @ParameterizedTest
    @ValueSource(ints = [1, 5, 10])
    @DisplayName("1 이상의 높이를 입력할 수 있다.")
    fun input(value: Int) {
        val height = Height(value)

        assertThat(height.value).isEqualTo(value)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, -1, -5])
    @DisplayName("높이는 0 미만일 수 없다.")
    fun inputForThrow(value: Int) {
        assertThrows<InvalidHeightException> { Height(value) }
    }
}
