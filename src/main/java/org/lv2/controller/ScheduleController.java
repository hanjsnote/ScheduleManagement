package org.lv2.controller;

import lombok.RequiredArgsConstructor;
import org.common.dto.ScheduleRequest;
import org.common.dto.ScheduleResponse;
import org.lv2.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleResponse> createdSchedule(@RequestBody ScheduleRequest request){
        return ResponseEntity.ok(scheduleService.save(request));
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<ScheduleResponse>> getSchedules(){
        return ResponseEntity.ok(scheduleService.findSchedules());
    }

    @GetMapping("/schedules/{id}")
    public ScheduleResponse getSchedule(@PathVariable Long id){
        return scheduleService.findSchedule(id);
    }

}
