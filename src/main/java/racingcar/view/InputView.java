package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String DELIMITER = ",";

    public String[] requestCarName() {
        String input = Console.readLine().strip();
        return input.split(DELIMITER);
    }

    public int requestRaceCount() {
        String input = Console.readLine().strip();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}
