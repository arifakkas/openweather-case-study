package case_study.spring_boot_case_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "case_study" })
public class WeatherApplication {

    public static void main(final String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }
}
