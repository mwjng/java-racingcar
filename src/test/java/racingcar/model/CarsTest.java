package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    void 자동차가_2대_미만이면_예외가_발생한다() {
        // given
        List<Car> cars = List.of(new Car(new CarName("pobi")));
        List<Car> emptyList = Collections.emptyList();

        // when & then
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> new Cars(cars)),
                () -> assertThrows(IllegalArgumentException.class, () -> new Cars(emptyList))
        );
    }

    @Test
    void 동일한_이름을_갖는_자동차가_2개_이상_존재하면_예외가_발생한다() {
        // given
        List<Car> cars = List.of(
                new Car(new CarName("pobi")),
                new Car(new CarName("woni")),
                new Car(new CarName("pobi"))
        );

        // when & then
        assertThatThrownBy(() -> new Cars(cars))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("중복된 자동차 이름이 있으면 안됩니다.");
    }
}