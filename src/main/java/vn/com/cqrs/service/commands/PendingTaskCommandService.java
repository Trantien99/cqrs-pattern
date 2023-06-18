package vn.com.cqrs.service.commands;

import vn.com.cqrs.models.PendingTask;

public interface PendingTaskCommandService {
    void insertPendingTask(PendingTask logging);
}
