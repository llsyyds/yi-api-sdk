package lls.yihang.yiapisdk.service.impi;

import lls.yihang.yiapisdk.client.YiApiClient;
import lls.yihang.yiapisdk.exception.ApiException;
import lls.yihang.yiapisdk.model.response.LoveResponse;
import lls.yihang.yiapisdk.model.response.PoisonousChickenSoupResponse;
import lls.yihang.yiapisdk.model.response.RandomWallpaperResponse;
import lls.yihang.yiapisdk.model.response.ResultResponse;
import lls.yihang.yiapisdk.service.ApiService;
import lls.yihang.yiapisdk.service.BaseService;
import lls.yihang.yiapisdk.model.request.*;
import lombok.extern.slf4j.Slf4j;


/**
 * @PROJECT_NAME: yi-api-sdk
 * @DESCRIPTION:
 * @AUTHOR: lls
 * @DATE: 2024/1/17 20:38
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(YiApiClient qiApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(qiApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(YiApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(YiApiClient qiApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(YiApiClient qiApiClient, HoroscopeRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(YiApiClient qiApiClient, IpInfoRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(YiApiClient qiApiClient, WeatherRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
