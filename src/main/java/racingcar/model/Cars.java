package racingcar.model;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validate(cars);
        this.cars = cars;
    }

    private void validate(List<Car> cars) {
        validateAtLeastTwoCars(cars);
        validateDuplicate(cars);
    }

    private void validateAtLeastTwoCars(List<Car> cars) {
        if (cars.size() < 2) {
            throw new IllegalArgumentException("자동차 이름은 2개 이상 존재해야 합니다.");
        }
    }

    private void validateDuplicate(List<Car> cars) {
        if (hasDuplicate(cars)) {
            throw new IllegalArgumentException("중복된 자동차 이름이 있으면 안됩니다.");
        }
    }

    private boolean hasDuplicate(List<Car> cars) {
        return cars.size() != cars.stream()
                .distinct()
                .count();
    }
}
