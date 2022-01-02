package minesweeper.domain

import minesweeper.exception.InvalidMineException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@DisplayName("지뢰 관리 테스트")
class MineTest {

    @ParameterizedTest
    @ValueSource(ints = [1, 3, 5, 10])
    @DisplayName("1개 이상 지뢰를 설정할 수 있다.")
    fun correctly(count: Int) {
        val mine = Mine(count)

        assertThat(mine.count).isEqualTo(count)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, -1, -5])
    @DisplayName("지뢰는 1개 이상만 설정이 가능하다.")
    fun inputForThrow(count: Int) {
        assertThrows<InvalidMineException> { Mine(count) }
    }
}
