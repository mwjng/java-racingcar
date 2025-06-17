package racingcar.model;

public class Car {

    private final CarName name;

    public Car(CarName name) {
        this.name = name;
    }

    public CarName getName() {
        return this.name;
    }
}
