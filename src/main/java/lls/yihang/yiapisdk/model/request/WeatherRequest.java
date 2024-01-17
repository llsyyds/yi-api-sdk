package lls.yihang.yiapisdk.model.request;

import lls.yihang.yiapisdk.model.enums.RequestMethodEnum;
import lls.yihang.yiapisdk.model.params.WeatherParams;
import lls.yihang.yiapisdk.model.response.NameResponse;
import lls.yihang.yiapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
