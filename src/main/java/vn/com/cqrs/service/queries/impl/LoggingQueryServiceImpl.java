package vn.com.cqrs.service.queries.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.Logging;
import vn.com.cqrs.repository.LoggingQueryRepository;
import vn.com.cqrs.service.queries.LoggingQueryService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoggingQueryServiceImpl implements LoggingQueryService {
    private final LoggingQueryRepository loggingQueryRepository;
    @Override
    public List<Logging> getAll() {
        return loggingQueryRepository.loggingQuery;
    }
}
