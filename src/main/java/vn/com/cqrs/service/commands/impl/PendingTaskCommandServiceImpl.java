package vn.com.cqrs.service.commands.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.PendingTask;
import vn.com.cqrs.repository.PendingTaskCommandRepository;
import vn.com.cqrs.service.commands.PendingTaskCommandService;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PendingTaskCommandServiceImpl implements PendingTaskCommandService {
    private final PendingTaskCommandRepository pendingTaskCommandRepository;
    @Override
    public void insertPendingTask(PendingTask logging) {
        log.info("Insert pending task");
        logging.setId(UUID.randomUUID().toString());
        pendingTaskCommandRepository.pendingTasks.add(logging);
    }
}
