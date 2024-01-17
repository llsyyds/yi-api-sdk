package lls.yihang.yiapisdk.model.request;

import lls.yihang.yiapisdk.model.enums.RequestMethodEnum;
import lls.yihang.yiapisdk.model.response.LoveResponse;
import lls.yihang.yiapisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

    @Override
    public String getPath() {
        return "/loveTalk";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<LoveResponse> getResponseClass() {
        return LoveResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
