package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RaceWinner {

    private final List<Car> winningCars;

    public RaceWinner(List<Car> winningCars) {
        this.winningCars = winningCars;
    }

    public List<Car> getWinningCars() {
        return new ArrayList<>(this.winningCars);
    }
}
