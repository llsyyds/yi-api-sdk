package lls.yihang.yiapisdk.exception;

import lombok.Data;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
