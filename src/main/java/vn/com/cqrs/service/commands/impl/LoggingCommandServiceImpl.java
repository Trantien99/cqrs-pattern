package vn.com.cqrs.service.commands.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.Logging;
import vn.com.cqrs.repository.LoggingCommandRepository;
import vn.com.cqrs.service.commands.LoggingCommandService;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoggingCommandServiceImpl implements LoggingCommandService {
    private final LoggingCommandRepository loggingCommandRepository;
    @Override
    public void insertLog(Logging logging) {
        log.info("Insert logging");
        logging.setId(UUID.randomUUID().toString());
        loggingCommandRepository.loggingCommand.add(logging);
    }
}
