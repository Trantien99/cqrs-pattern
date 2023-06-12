package vn.com.cqrs.schedule;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import vn.com.cqrs.repository.LoggingCommandRepository;
import vn.com.cqrs.repository.LoggingQueryRepository;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class AsyncJob {

    private final LoggingQueryRepository loggingQueryRepository;
    private final LoggingCommandRepository loggingCommandRepository;

    @Scheduled(fixedDelay = 5000)
    public void scheduleAsyncData() {
        loggingQueryRepository.loggingQuery.clear();
        loggingQueryRepository.loggingQuery.addAll(loggingCommandRepository.loggingCommand);
    }
}
