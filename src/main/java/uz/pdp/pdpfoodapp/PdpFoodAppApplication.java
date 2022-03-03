package uz.pdp.pdpfoodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableScheduling
@EnableSwagger2
@SpringBootApplication
public class PdpFoodAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(PdpFoodAppApplication.class, args);
    }

    @Scheduled(cron = "0 10 8-10 * * MON-FRI")
    public void scheduler() {
        System.out.println("Do you order for lunch?");
    }
}
