package org.lv2.repository;

import org.lv2.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRespository extends JpaRepository<Schedule, Long> {
}
