package vn.com.cqrs.service.queries.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.com.cqrs.models.Logging;
import vn.com.cqrs.repository.LoggingQueryRepository;
import vn.com.cqrs.service.queries.LoggingQueryService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoggingQueryServiceImpl implements LoggingQueryService {
    private final LoggingQueryRepository loggingQueryRepository;
    @Override
    public List<Logging> getAll() {
        log.info("Query logging");
        return loggingQueryRepository.loggingQuery;
    }

    @Override
    public List<Logging> findByLever(String lever) {
        log.info("Query logging by lever");
        return loggingQueryRepository.loggingQuery.stream().filter(l -> l.getLever().equals(lever)).collect(Collectors.toList());
    }
}
