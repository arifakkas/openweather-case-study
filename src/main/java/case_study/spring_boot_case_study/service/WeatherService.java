package case_study.spring_boot_case_study.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import case_study.spring_boot_case_study.model.WeatherModel;

@Service
public class WeatherService {

    public static final String BASE_URL  = "http://api.openweathermap.org/data/2.5";
    public static final String WEATHER   = "/weather";
    public static final String GROUP     = "/group";
    public static final String CITY_NAME = "?q=";
    public static final String APP_ID    = "&appid=";
    public static final String API_KEY   = "21dd8b68ceae0e6a2f15958a9b46e24b";

    private final RestTemplate restTemplate;

    public WeatherService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherModel getWeather(final String cityName) {
        return this.restTemplate.getForObject(this.generateUrl(cityName), WeatherModel.class);
    }

    // api.openweathermap.org/data/2.5/weather?q=London&APPID=21dd8b68ceae0e6a2f15958a9b46e24b
    public String generateUrl(final String cityName) {
        return new StringBuilder().append(BASE_URL).append(WEATHER).append(CITY_NAME).append(cityName).append(APP_ID).append(API_KEY).toString();
    }

}