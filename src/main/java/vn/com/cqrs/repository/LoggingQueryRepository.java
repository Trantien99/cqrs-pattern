package vn.com.cqrs.repository;

import org.springframework.stereotype.Repository;
import vn.com.cqrs.models.Logging;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoggingQueryRepository {

    public final List<Logging> loggingQuery = new ArrayList<>();
}
