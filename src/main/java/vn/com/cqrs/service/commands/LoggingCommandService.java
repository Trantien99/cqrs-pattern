package vn.com.cqrs.service.commands;

import vn.com.cqrs.models.Logging;

public interface LoggingCommandService {
    void insertLog(Logging logging);
}
