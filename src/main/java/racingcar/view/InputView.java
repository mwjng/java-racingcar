package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;

public class InputView {

    private static final String DELIMITER = ",";

    public Cars requestCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = Console.readLine().strip();
        List<Car> cars = parseToCars(input);
        return new Cars(cars);
    }

    private List<Car> parseToCars(String input) {
        String[] split = input.split(DELIMITER);
        return Arrays.stream(split)
                .map(Car::new)
                .toList();
    }
}
