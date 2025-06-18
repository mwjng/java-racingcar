package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RaceCountTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void 이동_횟수가_1_미만이면_예외가_발생한다(int count) {
        // when & then
        assertThatThrownBy(() -> new RaceCount(count))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이동 횟수는 1이상이어야 합니다.");
    }
}