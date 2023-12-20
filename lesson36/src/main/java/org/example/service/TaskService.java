package org.example.service;
import org.example.domain.TaskEntity;

public interface TaskService {

    void save(TaskEntity task);
    void update(TaskEntity task);
}
