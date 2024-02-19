package case_study.spring_boot_case_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import case_study.spring_boot_case_study.model.WeatherModel;
import case_study.spring_boot_case_study.service.WeatherService;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public WeatherModel getWeather(@PathVariable
    final String city) {
        return this.weatherService.getWeather(city);
    }
}
