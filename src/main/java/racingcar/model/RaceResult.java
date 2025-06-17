package racingcar.model;

import java.util.Map;

public class RaceResult {

    private final Map<Car, CarState> result;

    public RaceResult(Map<Car, CarState> result) {
        this.result = result;
    }
}
