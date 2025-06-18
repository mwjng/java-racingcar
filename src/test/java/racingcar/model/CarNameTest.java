package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CarNameTest {

    @Test
    void 이름의_길이가_5자_이하면_정상적으로_생성된다() {
        // given
        String name = "abcde";
        
        // when
        CarName carName = new CarName(name);

        // then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @Test
    void 이름의_길이가_5자를_초과하면_예외가_발생한다() {
        // given
        String name = "abcdef";

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자 이하만 가능합니다.");
    }

    @Test
    void 이름이_비어있으면_예외가_발생한다() {
        // given
        String name = "";

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 비어있으면 안됩니다.");
    }
}