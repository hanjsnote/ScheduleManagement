package org.lv1.repository;

import org.lv1.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRespository extends JpaRepository<Schedule, Long> {
}
