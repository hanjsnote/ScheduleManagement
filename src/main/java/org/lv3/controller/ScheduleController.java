package org.lv3.controller;

import lombok.RequiredArgsConstructor;
import org.common.dto.ScheduleRequest;
import org.common.dto.ScheduleResponse;
import org.lv3.service.ScheduleService;
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

    @PutMapping("/schedules/{id}")
    public ResponseEntity<ScheduleResponse> updateSchedule(@PathVariable Long id, @RequestBody ScheduleRequest request){
        return ResponseEntity.ok(scheduleService.updateSchedule(id, request));
    }

}
