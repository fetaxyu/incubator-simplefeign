package io.matrix.toolkit.exception;

/**
 * @author Noa Swartz
 * @date 2020/09/01
 */
public abstract class AbstractException extends RuntimeException {

    protected String errorCode;

    public AbstractException(ErrorInfo errorInfo) {
        this(errorInfo.getCode(), errorInfo.getReason());
    }

    public AbstractException(String errorCode, String errorDesc) {
        super(errorDesc);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
