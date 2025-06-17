package racingcar;

import java.util.Arrays;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceGame {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        Cars cars = createCarsFromUserInput();
        Race race = createRaceFromUserInput(cars);
    }

    private Cars createCarsFromUserInput() {
        outputView.printRequestCarNameMessage();
        String[] carNames = inputView.requestCarName();
        return convertToCars(carNames);
    }

    private Cars convertToCars(String[] carNames) {
        return new Cars(Arrays.stream(carNames)
                .map(Car::new)
                .toList());
    }

    private Race createRaceFromUserInput(Cars cars) {
        outputView.printRequestRaceCountMessage();
        int raceCount = inputView.requestRaceCount();
        return new Race(cars, raceCount);
    }
}
