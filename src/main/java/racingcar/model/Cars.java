package racingcar.model;

import java.util.List;

public class Cars {

    private static final int MINIMUM_NAMES_COUNT = 2;
    private static final String NAMES_COUNT_ERROR_MESSAGE = "자동차 이름은 2개 이상 존재해야 합니다.";
    private static final String NAMES_DUPLICATE_ERROR_MESSAGE = "중복된 자동차 이름이 있으면 안됩니다.";

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validate(cars);
        this.cars = cars;
    }

    public void moveOrStopAll() {
        cars.forEach(Car::moveOrStop);
    }

    private void validate(List<Car> cars) {
        validateCount(cars);
        validateDuplicate(cars);
    }

    private void validateCount(List<Car> cars) {
        if (cars.size() < MINIMUM_NAMES_COUNT) {
            throw new IllegalArgumentException(NAMES_COUNT_ERROR_MESSAGE);
        }
    }

    private void validateDuplicate(List<Car> cars) {
        if (hasDuplicate(cars)) {
            throw new IllegalArgumentException(NAMES_DUPLICATE_ERROR_MESSAGE);
        }
    }

    private boolean hasDuplicate(List<Car> cars) {
        return cars.size() != cars.stream()
                .map(Car::getCarName)
                .distinct()
                .count();
    }
}
