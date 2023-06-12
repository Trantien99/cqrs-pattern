package vn.com.cqrs.repository;

import org.springframework.stereotype.Repository;
import vn.com.cqrs.models.Logging;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoggingCommandRepository {
    public final List<Logging> loggingCommand = new ArrayList<>();
}
