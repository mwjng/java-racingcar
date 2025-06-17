package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String DELIMITER = ",";

    public String[] requestCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = Console.readLine().strip();
        return input.split(DELIMITER);
    }

    public int requestRaceCount() {
        System.out.println("시도할 회수는 몇회인가요?");

        String input = Console.readLine().strip();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}
