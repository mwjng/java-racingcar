package racingcar.model;

public class RaceCount {

    private static final String RACE_COUNT_ERROR_MESSAGE = "이동 횟수는 1이상이어야 합니다.";
    private static final int MINIMUM_COUNT = 1;

    private final int count;

    public RaceCount(int count) {
        validateCount(count);
        this.count = count;
    }

    public void repeat(Runnable runnable) {
        for (int i = 0; i < this.count; i++) {
            runnable.run();
        }
    }

    private void validateCount(int count) {
        if (count < MINIMUM_COUNT) {
            throw new IllegalArgumentException(RACE_COUNT_ERROR_MESSAGE);
        }
    }
}
