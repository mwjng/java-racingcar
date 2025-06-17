package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int MINIMUM_RANDOM_NUMBER = 0;
    private static final int MAXIMUM_RANDOM_NUMBER = 9;
    private static final int MOVING_STANDARD_NUMBER = 4;

    private final CarName carName;
    private Position position = new Position();

    public Car(CarName carName) {
        this.carName = carName;
    }

    public void moveOrStop() {
        if (canMove()) {
            this.position = this.position.increase();
        }
    }

    public CarName getCarName() {
        return this.carName;
    }

    public Position getPosition() {
        return this.position;
    }

    private boolean canMove() {
        int randomNumber = Randoms.pickNumberInRange(MINIMUM_RANDOM_NUMBER, MAXIMUM_RANDOM_NUMBER);
        return randomNumber >= MOVING_STANDARD_NUMBER;
    }
}
