package lls.yihang.yiapisdk.model.request;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lls.yihang.yiapisdk.model.enums.RequestMethodEnum;
import lls.yihang.yiapisdk.model.response.ResultResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION: 基本api请求
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
public abstract class BaseRequest<O, T extends ResultResponse> {
    private Map<String, Object> requestParams = new HashMap<>();

    /**
     * get方法
     *
     * @return {@link RequestMethodEnum}
     */
    public abstract String getMethod();

    /**
     * 获取路径
     *
     * @return {@link String}
     */
    public abstract String getPath();

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link T}>
     */
    public abstract Class<T> getResponseClass();

    @JsonAnyGetter
    public Map<String, Object> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(O params) {
        this.requestParams = new Gson().fromJson(JSONUtil.toJsonStr(params), new TypeToken<Map<String, Object>>() {
        }.getType());
    }
}