package org.example.service;

import org.example.domain.PersonEntity;
import org.example.domain.TaskEntity;

public interface TaskDao {
    void save(TaskEntity task);
    void update(TaskEntity task);
    TaskEntity getTaskById(Integer id);
    void getTaskByPerson (String name);
}
