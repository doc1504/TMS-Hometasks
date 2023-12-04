package org.example.service;

import org.example.domain.PersonEntity;
import org.example.domain.TaskEntity;

public interface TaskDao {
    void saveTask (TaskEntity task);
    void addTask (TaskEntity task, PersonEntity person);
    void updateTask(TaskEntity task);
    TaskEntity getTaskById(Integer id);
    void getTaskByPerson (String name);
}
