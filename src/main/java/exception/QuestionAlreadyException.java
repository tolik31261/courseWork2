package exception;

public class QuestionAlreadyException extends RuntimeException {
    public QuestionAlreadyException() {
        super(message);
    }

    public QuestionAlreadyException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyException(Throwable cause) {
        super(cause);
    }

    public QuestionAlreadyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}