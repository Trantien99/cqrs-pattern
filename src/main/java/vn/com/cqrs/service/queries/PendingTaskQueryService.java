package vn.com.cqrs.service.queries;

import vn.com.cqrs.models.PendingTask;

import java.util.List;

public interface PendingTaskQueryService {
    List<PendingTask> getAll();

    PendingTask findById(String lever);

}
