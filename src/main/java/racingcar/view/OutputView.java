package racingcar.view;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.CarName;
import racingcar.model.Position;

public class OutputView {

    public void printRequestCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printRequestRaceCountMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printResultMessage() {
        System.out.println("\n실행 결과");
    }

    public void printCars(List<Car> cars) {
        cars.forEach(this::printCar);
        System.out.println();
    }

    private void printCar(Car car) {
        CarName carName = car.getCarName();
        Position position = car.getPosition();

        System.out.print(carName.getName() + " : ");
        for (int i = 0; i < position.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
