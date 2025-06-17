package racingcar.model;

import java.util.Objects;

public class CarName {

    private static final String WHITESPACE_ERROR_MESSAGE = "자동차 이름은 공백일 수 없습니다.";
    private static final String LENGTH_ERROR_MESSAGE = "자동차 이름은 5자 이하만 가능합니다.";
    private static final int MAXIMUM_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof CarName carName)) {
            return false;
        }
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    private void validate(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException(WHITESPACE_ERROR_MESSAGE);
        }
        if (name.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException(LENGTH_ERROR_MESSAGE);
        }
    }
}
