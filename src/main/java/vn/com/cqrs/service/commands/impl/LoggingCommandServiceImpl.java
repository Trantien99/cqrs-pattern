package vn.com.cqrs.service.commands.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.Logging;
import vn.com.cqrs.repository.LoggingCommandRepository;
import vn.com.cqrs.service.commands.LoggingCommandService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoggingCommandServiceImpl implements LoggingCommandService {
    private final LoggingCommandRepository loggingCommandRepository;
    @Override
    public void insertLog(Logging logging) {
        logging.setId(UUID.randomUUID().toString());
        loggingCommandRepository.loggingCommand.add(logging);
    }
}
