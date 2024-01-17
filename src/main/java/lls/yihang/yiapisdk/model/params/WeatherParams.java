package lls.yihang.yiapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: 获取天气请求参数
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Data
@Accessors(chain = true)
public class WeatherParams implements Serializable {
    private static final long serialVersionUID = 3815188540434269370L;
    private String ip;
    private String city;
    private String type;
}
