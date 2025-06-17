package racingcar;

import java.util.Arrays;
import racingcar.model.Car;
import racingcar.model.CarName;
import racingcar.model.Cars;
import racingcar.model.RaceCount;
import racingcar.model.RaceWinner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceGame {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        Cars cars = createCarsFromUserInput();
        RaceCount raceCount = createRaceFromUserInput(cars);

        startRace(raceCount, cars);

        printRaceWinners(cars);
    }

    private Cars createCarsFromUserInput() {
        outputView.printRequestCarNameMessage();
        String[] carNames = inputView.requestCarName();
        return convertToCars(carNames);
    }

    private Cars convertToCars(String[] carNames) {
        return new Cars(Arrays.stream(carNames)
                .map(CarName::new)
                .map(Car::new)
                .toList());
    }

    private RaceCount createRaceFromUserInput(Cars cars) {
        outputView.printRequestRaceCountMessage();
        int raceCount = inputView.requestRaceCount();
        return new RaceCount(raceCount);
    }

    private void startRace(RaceCount raceCount, Cars cars) {
        outputView.printResultMessage();
        raceCount.repeat(() -> playOneRound(cars));
    }

    private void playOneRound(Cars cars) {
        cars.moveOrStopAll();
        outputView.printCars(cars.getCars());
    }

    private void printRaceWinners(Cars cars) {
        RaceWinner raceWinner = cars.getRaceWinner();
        outputView.printRaceWinners(raceWinner.getWinningCars());
    }
}
