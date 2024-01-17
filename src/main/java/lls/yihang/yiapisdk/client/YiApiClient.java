package lls.yihang.yiapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: qi api客户端
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YiApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
