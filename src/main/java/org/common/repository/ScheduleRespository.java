package org.common.repository;

import org.common.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRespository extends JpaRepository<Schedule, Long> {
}
