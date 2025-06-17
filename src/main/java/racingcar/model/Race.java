package racingcar.model;

public class Race {

    private final Cars cars;
    private final int raceCount;

    public Race(Cars cars, int raceCount) {
        validateCount(raceCount);
        this.cars = cars;
        this.raceCount = raceCount;
    }

    public RaceResult execute() {
        for (int i = 0; i < raceCount; i++) {
            cars.move();
        }
    }

    private void validateCount(int raceCount) {
        if (raceCount < 1) {
            throw new IllegalArgumentException("이동 횟수는 0보다 커야 합니다.");
        }
    }
}
