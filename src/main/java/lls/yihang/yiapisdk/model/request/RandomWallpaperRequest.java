package lls.yihang.yiapisdk.model.request;

import lls.yihang.yiapisdk.model.enums.RequestMethodEnum;
import lls.yihang.yiapisdk.model.params.RandomWallpaperParams;
import lls.yihang.yiapisdk.model.response.RandomWallpaperResponse;
import lls.yihang.yiapisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
