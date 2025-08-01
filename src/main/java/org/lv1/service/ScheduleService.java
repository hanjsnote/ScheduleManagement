package org.lv1.service;

import lombok.RequiredArgsConstructor;
import org.common.dto.ScheduleRequest;
import org.common.dto.ScheduleResponse;
import org.common.entity.Schedule;
import org.common.repository.ScheduleRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRespository scheduleRespository;

    @Transactional
    public ScheduleResponse save(ScheduleRequest request) {
        Schedule schedule = new Schedule(request.getName(), request.getPassword(), request.getTitle(), request.getContent());
        Schedule savedSchedule = scheduleRespository.save(schedule);

        return new ScheduleResponse(
                savedSchedule.getId(),
                savedSchedule.getName(),
                savedSchedule.getTitle(),
                savedSchedule.getContent(),
                savedSchedule.getCreatedAt(),
                savedSchedule.getModifiedAt()
        );
    }
}
