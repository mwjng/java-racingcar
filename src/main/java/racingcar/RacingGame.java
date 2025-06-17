package racingcar;

import racingcar.model.Cars;
import racingcar.view.InputView;

public class RacingGame {

    private final InputView inputView = new InputView();

    public void run() {
        Cars cars = inputView.requestCarName();
    }
}
