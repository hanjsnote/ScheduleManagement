package org.lv2.service;

import lombok.RequiredArgsConstructor;
import org.common.dto.ScheduleRequest;
import org.common.dto.ScheduleResponse;
import org.common.entity.Schedule;
import org.common.repository.ScheduleRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRespository scheduleRespository;


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

    @Transactional(readOnly = true)
    public List<ScheduleResponse> findSchedules() {
        List<Schedule> schedules = scheduleRespository.findAll();
        List<ScheduleResponse> dtos = new ArrayList<>();

        for (Schedule schedule : schedules){
            dtos.add(new ScheduleResponse(
                    schedule.getId(),
                    schedule.getName(),
                    schedule.getTitle(),
                    schedule.getContent(),
                    schedule.getCreatedAt(),
                    schedule.getModifiedAt()
            ));
        }
        return dtos;
    }

    @Transactional(readOnly = true)
    public ScheduleResponse findSchedule(Long id) {
        Schedule schedule = scheduleRespository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 데이터가 없습니다.")
        );
        return new ScheduleResponse(
                schedule.getId(),
                schedule.getName(),
                schedule.getTitle(),
                schedule.getContent(),
                schedule.getCreatedAt(),
                schedule.getModifiedAt()
        );
    }
}
