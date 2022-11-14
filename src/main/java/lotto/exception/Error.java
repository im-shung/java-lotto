package lotto.exception;

public enum Error {
    WRONG_RANGE("로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    OVER_SIZE("로또 번호의 개수는 6개여야만 합니다."),
    NOT_DUPLICATE("로또 번호는 중복되지 않아야 합니다."),
    WRONG_AMOUNT("금액을 1,000단위로 입력해야 합니다.");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR] " + message;
    }
}
