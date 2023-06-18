package vn.com.cqrs.repository;

import org.springframework.stereotype.Repository;
import vn.com.cqrs.models.PendingTask;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PendingTaskQueryRepository {

    public final List<PendingTask> pendingTasks = new ArrayList<>();
}
