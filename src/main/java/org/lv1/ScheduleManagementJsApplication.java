package org.lv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ScheduleManagementJsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleManagementJsApplication.class, args);

    }

}
