package vn.com.cqrs.service.queries;

import vn.com.cqrs.models.Logging;

import java.util.List;

public interface LoggingQueryService {
    List<Logging> getAll();
}
