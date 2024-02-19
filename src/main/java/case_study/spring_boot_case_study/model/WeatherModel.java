package case_study.spring_boot_case_study.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {

    private Main main;

    public Main getMain() {
        return this.main;
    }

    public void setMain(final Main main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "WeatherData{" + "temperature=" + this.main.getTemp() + '}';
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Main {
    private double temp;

    private double temp_max;

    private double feels_like;

    private int    humidity;

    public double getTemp() {
        return this.temp;
    }

    public void setTemp(final double temp) {
        this.temp = temp;
    }

    public double getTemp_max() {
        return this.temp_max;
    }

    public void setTemp_max(final double temp_max) {
        this.temp_max = temp_max;
    }

    public double getFeels_like() {
        return this.feels_like;
    }

    public void setFeels_like(final double feels_like) {
        this.feels_like = feels_like;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
    }

}
