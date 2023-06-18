package vn.com.cqrs.schedule;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import vn.com.cqrs.repository.PendingTaskCommandRepository;
import vn.com.cqrs.repository.PendingTaskQueryRepository;

@Slf4j
@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class SyncJob {

    private final PendingTaskQueryRepository pendingTaskQueryRepository;
    private final PendingTaskCommandRepository pendingTaskCommandRepository;

    @Scheduled(fixedDelay = 5000)
    public void scheduleSyncData() {
        log.info("Synchronization pending task data");
        pendingTaskQueryRepository.pendingTasks.clear();
        pendingTaskQueryRepository.pendingTasks.addAll(pendingTaskCommandRepository.pendingTasks);
    }
}
