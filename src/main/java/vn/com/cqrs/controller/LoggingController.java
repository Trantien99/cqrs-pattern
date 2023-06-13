package vn.com.cqrs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.cqrs.models.Logging;
import vn.com.cqrs.service.commands.LoggingCommandService;
import vn.com.cqrs.service.queries.LoggingQueryService;

import java.util.List;

@RestController()
@RequestMapping("/logging")
@RequiredArgsConstructor
public class LoggingController {
    private final LoggingQueryService loggingQueryService;
    private final LoggingCommandService loggingCommandService;

    @GetMapping("")
    private ResponseEntity<List<Logging>> getLogging() {
        return ResponseEntity.ok(loggingQueryService.getAll());
    }

    @GetMapping("/lever")
    private ResponseEntity<List<Logging>> getLoggingByLever(@RequestParam String lever) {
        return ResponseEntity.ok(loggingQueryService.findByLever(lever));
    }

    @PostMapping("")
    private ResponseEntity insertLog(@RequestBody Logging logging) {
        loggingCommandService.insertLog(logging);
        return new ResponseEntity(HttpStatus.OK);
    }

}
