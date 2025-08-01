package org.lv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {
        "org.common",    // 공통 코드
        "org.lv3"        // 현재 애플리케이션
})
@EnableJpaRepositories(basePackages = "org.common.repository") // 레포지토리 위치 명시
@EntityScan(basePackages = "org.common.entity") // 엔티티 위치 명시
public class ScheduleManagementApplicationLv3 {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleManagementApplicationLv3.class, args);

    }

}
