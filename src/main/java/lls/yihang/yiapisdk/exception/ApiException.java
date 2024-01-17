package lls.yihang.yiapisdk.exception;


/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: 自定义异常类
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
public class ApiException extends Exception {

    private static final long serialVersionUID = 2942420535500634982L;
    private int code;

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public ApiException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
