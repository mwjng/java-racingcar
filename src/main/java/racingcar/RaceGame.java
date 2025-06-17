package racingcar;

import java.util.Arrays;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.view.InputView;

public class RaceGame {

    private final InputView inputView = new InputView();

    public void run() {
        Cars cars = getCars();
        Race race = getRace(cars);
    }

    private Cars getCars() {
        String[] carNames = inputView.requestCarName();
        return parseToCars(carNames);
    }

    private Cars parseToCars(String[] carNames) {
        return new Cars(Arrays.stream(carNames)
                .map(Car::new)
                .toList());
    }

    private Race getRace(Cars cars) {
        int raceCount = inputView.requestRaceCount();
        return new Race(cars, raceCount);
    }
}
