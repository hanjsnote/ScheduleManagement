package org.lv1.service;

import lombok.RequiredArgsConstructor;
import org.lv1.dto.ScheduleRequest;
import org.lv1.dto.ScheduleResponse;
import org.lv1.entity.Schedule;
import org.lv1.repository.ScheduleRespository;
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
