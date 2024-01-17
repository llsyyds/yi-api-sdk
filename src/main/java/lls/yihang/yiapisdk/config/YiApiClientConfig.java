package lls.yihang.yiapisdk.config;

import lls.yihang.yiapisdk.client.YiApiClient;
import lls.yihang.yiapisdk.service.ApiService;
import lls.yihang.yiapisdk.service.impi.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
@Configuration
@ConfigurationProperties("yi.api.client")
@ComponentScan
public class YiApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public YiApiClient qiApiClient() {
        return new YiApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setQiApiClient(qiApiClient());
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
