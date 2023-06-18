package vn.com.cqrs.service.queries.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.PendingTask;
import vn.com.cqrs.repository.PendingTaskQueryRepository;
import vn.com.cqrs.service.queries.PendingTaskQueryService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PendingTaskQueryServiceImpl implements PendingTaskQueryService {
    private final PendingTaskQueryRepository pendingTaskQueryRepository;
    @Override
    public List<PendingTask> getAll() {
        log.info("Query pending task");
        return pendingTaskQueryRepository.pendingTasks;
    }

    @Override
    public PendingTask findById(String id) {
        log.info("Query pending task by id");
        try {
            return pendingTaskQueryRepository.pendingTasks.stream().filter(pt -> pt.getId().equals(id)).findFirst().get();
        } catch (Exception e) {
            log.error("Pending task not exist");
        }
        return null;
    }
}
