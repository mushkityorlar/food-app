package uz.pdp.pdpfoodapp;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.pdp.pdpfoodapp.entity.auth.Role;
import uz.pdp.pdpfoodapp.entity.auth.User;
import uz.pdp.pdpfoodapp.service.user.UserService;

import java.util.Arrays;


@EnableScheduling
@SpringBootApplication
@RequiredArgsConstructor
public class PdpFoodAppApplication {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(PdpFoodAppApplication.class, args);
    }

    @Scheduled(cron = "0 10 8-10 * * MON-FRI")
    public void scheduler() {
        System.out.println("Do you order for lunch?");
    }


    @Bean
    CommandLineRunner run() {
        return args -> {

            Role admin = new Role(null, "ADMIN");
            Role manager = new Role(null, "MANAGER");
            Role employee = new Role(null, "EMPLOYEE");

            userService.saveRole(admin);
            userService.saveRole(manager);
            userService.saveRole(employee);


            userService.saveUser(new User("admin", passwordEncoder.encode("123"), null, null, Arrays.asList(admin, manager), null, null, null, true, false));
            userService.saveUser(new User("manager", passwordEncoder.encode("123"), null, null, Arrays.asList(manager), null, null, null, true, false));
            userService.saveUser(new User("employee", passwordEncoder.encode("123"), null, null, Arrays.asList(employee), null, null, null, true, false));
        };
    }
}
