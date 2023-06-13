package vn.com.cqrs.schedule;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import vn.com.cqrs.repository.LoggingCommandRepository;
import vn.com.cqrs.repository.LoggingQueryRepository;

@Slf4j
@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class SyncJob {

    private final LoggingQueryRepository loggingQueryRepository;
    private final LoggingCommandRepository loggingCommandRepository;

    @Scheduled(fixedDelay = 5000)
    public void scheduleSyncData() {
        log.info("Synchronization data logging");
        loggingQueryRepository.loggingQuery.clear();
        loggingQueryRepository.loggingQuery.addAll(loggingCommandRepository.loggingCommand);
    }
}
