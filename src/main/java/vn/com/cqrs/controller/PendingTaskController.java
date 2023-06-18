package vn.com.cqrs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.cqrs.models.PendingTask;
import vn.com.cqrs.service.commands.PendingTaskCommandService;
import vn.com.cqrs.service.queries.PendingTaskQueryService;

import java.util.List;

@RestController()
@RequestMapping("/pendingtasks")
@RequiredArgsConstructor
public class PendingTaskController {
    private final PendingTaskQueryService pendingTaskQueryService;
    private final PendingTaskCommandService pendingTaskCommandService;

    @GetMapping("")
    private ResponseEntity<List<PendingTask>> getPendingTasks() {
        return ResponseEntity.ok(pendingTaskQueryService.getAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<PendingTask> getPendingTaskById(@RequestParam String id) {
        return ResponseEntity.ok(pendingTaskQueryService.findById(id));
    }

    @PostMapping("")
    private ResponseEntity insertPendingTask(@RequestBody PendingTask logging) {
        pendingTaskCommandService.insertPendingTask(logging);
        return new ResponseEntity(HttpStatus.OK);
    }

}
