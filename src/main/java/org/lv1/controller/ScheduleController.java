package org.lv1.controller;

import lombok.RequiredArgsConstructor;
import org.common.dto.ScheduleRequest;
import org.common.dto.ScheduleResponse;
import org.lv1.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleResponse> createdSchedule(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(scheduleService.save(request));
    }
}
